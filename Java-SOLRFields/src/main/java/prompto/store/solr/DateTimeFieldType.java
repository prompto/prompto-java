package prompto.store.solr;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.FieldType.NumericType;
import org.apache.lucene.document.LongField;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.search.SortField;
import org.apache.lucene.uninverting.UninvertingReader.Type;
import org.apache.lucene.util.BytesRefBuilder;
import org.apache.lucene.util.NumericUtils;
import org.apache.solr.response.TextResponseWriter;
import org.apache.solr.schema.FieldType;
import org.apache.solr.schema.SchemaField;

public class DateTimeFieldType extends FieldType {

	@Override
	public Type getUninversionType(SchemaField sf) {
		if (sf.multiValued())
			return Type.SORTED_SET_LONG;
		else
			return Type.LONG;
	}

	@Override
	public void write(TextResponseWriter writer, String name, IndexableField f) throws IOException {
		writer.writeStr(name, f.stringValue(), true);
	}

    @Override
    public void readableToIndexed(CharSequence val, BytesRefBuilder result) {
	    ZonedDateTime dateTime = ZonedDateTime.parse(val.toString());
	    long millis = dateTime.toInstant().toEpochMilli();
        NumericUtils.longToPrefixCodedBytes(millis, 0, result);
    }

	
	@Override
	public SortField getSortField(SchemaField field, boolean reverse) {
		field.checkSortability();
		Long missingValue = null;
		if (field.sortMissingLast())
			missingValue = reverse ? Long.MIN_VALUE : Long.MAX_VALUE;
		else if (field.sortMissingFirst())
			missingValue = reverse ? Long.MAX_VALUE : Long.MIN_VALUE;
		SortField sf = new SortField(field.getName(), SortField.Type.LONG, reverse);
		sf.setMissingValue(missingValue);
		return sf;

	}
	
	@Override
	public List<IndexableField> createFields(SchemaField field, Object value, float boost) {
		List<IndexableField> fields = new ArrayList<>();
		if(field.stored())
			fields.add(createStoredField(field, value, boost));
		if(field.indexed())
			fields.add(createIndexedField(field, value, boost));
		return fields.isEmpty() ? null : fields;
	}

	private IndexableField createIndexedField(SchemaField field, Object value, float boost) {
	    org.apache.lucene.document.FieldType type = new org.apache.lucene.document.FieldType();
	    type.setTokenized(false);
	    type.setStored(false);
	    type.setOmitNorms(true);
	    type.setNumericType(NumericType.LONG);
	    type.setIndexOptions(getIndexOptions(field, value.toString()));
	    type.setStoreTermVectors(field.storeTermVector());
	    type.setStoreTermVectorOffsets(field.storeTermOffsets());
	    type.setStoreTermVectorPositions(field.storeTermPositions());
	    type.setStoreTermVectorPayloads(field.storeTermPayloads());
	    ZonedDateTime dateTime = ZonedDateTime.parse(value.toString());
	    long millis = dateTime.toInstant().toEpochMilli();
	    return new LongField(field.getName(), millis, type);
	}

	private IndexableField createStoredField(SchemaField field, Object value, float boost) {
	    org.apache.lucene.document.FieldType type = new org.apache.lucene.document.FieldType();
	    type.setTokenized(false);
	    type.setStored(true);
	    type.setOmitNorms(true);
	    type.setIndexOptions(IndexOptions.NONE);
	    type.setStoreTermVectors(field.storeTermVector());
	    type.setStoreTermVectorOffsets(field.storeTermOffsets());
	    type.setStoreTermVectorPositions(field.storeTermPositions());
	    type.setStoreTermVectorPayloads(field.storeTermPayloads());
	    return createField(field.getName(), value.toString(), type, boost);
	}
}
