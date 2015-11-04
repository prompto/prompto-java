package prompto.store.solr;

import java.time.LocalDate;

import org.apache.lucene.index.IndexableField;
import org.apache.solr.schema.SchemaField;
import org.apache.solr.schema.TrieIntField;

public class DateFieldType extends TrieIntField {

	@Override
	public String toExternal(IndexableField field) {
		int value = field.numericValue().intValue();
		return buildDateString(value);
	}
	
	private String buildDateString(int value) {
		int day = 1 + ( value & 0x0000001F );
		int month = 1 + ( ( value & 0x000001E0 ) >> 5 );
		int year = ( value & 0xFFFFFE00 ) >> 9;
		LocalDate date = LocalDate.of(year,  month, day);
		return date.toString();
	}

	@Override
	public IndexableField createField(SchemaField field, Object value, float boost) {
		if(value instanceof String)
			value = parseDateString(value.toString());
		return super.createField(field, value, boost);
	}

	private Integer parseDateString(String value) {
		LocalDate date = LocalDate.parse(value);
		return (( date.getYear() << 9 ) & 0xFFFFFE00 )
			| ((( date.getMonth().getValue() - 1 ) << 5 ) & 0x000001E0 )
			| (( date.getDayOfMonth() - 1 ) & 0x0000001F );
	}

}
