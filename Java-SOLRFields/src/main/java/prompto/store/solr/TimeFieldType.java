package prompto.store.solr;

import java.time.LocalTime;

import org.apache.lucene.index.IndexableField;
import org.apache.lucene.util.BytesRefBuilder;
import org.apache.lucene.util.NumericUtils;
import org.apache.solr.schema.SchemaField;
import org.apache.solr.schema.TrieLongField;

public class TimeFieldType extends TrieLongField {

	@Override
	public Object toNativeType(Object val) {
	    if(val==null) 
	    	return null;
	    else if (val instanceof Number) 
	    	return ((Number) val).longValue();
	    else if (val instanceof String) 
	    	return parseTimeString((String) val);
	    else
	    	return super.toNativeType(val);
	}

	@Override
	public String toExternal(IndexableField field) {
		long value = field.numericValue().longValue();
		return buildTimeString(value);
	}
	
	private String buildTimeString(long value) {
		int hour = (byte)(( value & 0x00FF000000000000L ) >> 48);
		int minute = (byte)(( value & 0x0000FF0000000000L ) >> 40);
		int second = (byte)(( value & 0x000000FF00000000L ) >> 32);
		int nanos = (int)(value & 0x00000000FFFFFFFFL);
		LocalTime time = LocalTime.of(hour, minute, second, nanos);
		return time.toString();
	}

	@Override
	public IndexableField createField(SchemaField field, Object value, float boost) {
		if(value instanceof String)
			value = parseTimeString(value.toString());
		return super.createField(field, value, boost);
	}

	private Long parseTimeString(String value) {
		LocalTime time = LocalTime.parse(value);
		return (( (long)time.getHour() << 48 ) & 0x00FF000000000000L )
			| (( (long)time.getMinute() << 40 ) & 0x0000FF0000000000L )
			| (( (long)time.getSecond() << 32 ) & 0x000000FF00000000L )
			| (long)time.getNano();
	}
	
    @Override
    public void readableToIndexed(CharSequence val, BytesRefBuilder result) {
    	Long value = parseTimeString(val.toString());
        NumericUtils.longToPrefixCodedBytes(value, 0, result);
    }


}
