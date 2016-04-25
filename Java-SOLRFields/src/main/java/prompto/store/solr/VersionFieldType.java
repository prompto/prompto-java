package prompto.store.solr;

import org.apache.lucene.index.IndexableField;
import org.apache.lucene.util.BytesRefBuilder;
import org.apache.lucene.util.NumericUtils;
import org.apache.solr.schema.SchemaField;
import org.apache.solr.schema.TrieIntField;

public class VersionFieldType extends TrieIntField {

	@Override
	public Object toNativeType(Object val) {
	    if(val==null) 
	    	return null;
	    else if (val instanceof Number) 
	    	return ((Number) val).intValue();
	    else if (val instanceof String) 
	    	return parseVersionString((String) val);
	    else
	    	return super.toNativeType(val);
	}
	
	@Override
	public String toExternal(IndexableField field) {
		// need an int, but use a long to avoid sign issues
		long value = field.numericValue().longValue();
		return buildVersionString(value);
	}
	
	private String buildVersionString(long value) {
		StringBuilder sb = new StringBuilder();
		sb.append((value >> 24) & 0x000000FF);
		sb.append('.');
		sb.append((value >> 16) & 0x000000FF);
		sb.append('.');
		sb.append((value >> 8) & 0x000000FF);
		if((value & 0x000000FF)!=0) {
			sb.append('.');
			sb.append(value & 0x000000FF);
		}
		return sb.toString();
	}

	@Override
	public IndexableField createField(SchemaField field, Object value, float boost) {
		if(value instanceof String)
			value = parseVersionString(value.toString());
		return super.createField(field, value, boost);
	}

	private Integer parseVersionString(String value) {
		String[] parts = value.split("\\.");
		// need an int, but use a long to avoid sign issues
		long version = 0;
		if(parts.length>0)
			version |= (Long.parseLong(parts[0]) << 24) & 0xFF000000;
		if(parts.length>1)
			version |= (Long.parseLong(parts[1]) << 16) & 0x00FF0000;
		if(parts.length>2)
			version |= (Long.parseLong(parts[2]) << 8) & 0x0000FF00;
		if(parts.length>3)
			version |= Long.parseLong(parts[3]) & 0x000000FF;
		return (int)(version & 0xFFFFFFFF);
	}
	
	@Override
	public void readableToIndexed(CharSequence val, BytesRefBuilder result) {
		Integer value = parseVersionString(val.toString());
        NumericUtils.intToPrefixCodedBytes(value, 0, result);
	}

}
