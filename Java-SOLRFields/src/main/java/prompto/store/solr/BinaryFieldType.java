package prompto.store.solr;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.SortedDocValuesField;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.search.SortField;
import org.apache.lucene.uninverting.UninvertingReader.Type;
import org.apache.lucene.util.BytesRef;
import org.apache.solr.common.util.Base64;
import org.apache.solr.schema.BinaryField;
import org.apache.solr.schema.SchemaField;

public class BinaryFieldType extends BinaryField {

	@Override
	public List<IndexableField> createFields(SchemaField field, Object value,
			float boost) {
		List<IndexableField> fields = new ArrayList<>();
		// add indexed field for mime type
		fields.add(createMimeTypeField(field, value, boost));
		// add regular binary field for storage
		fields.add(createField(field, value, boost));
		return fields;
	}

	private IndexableField createMimeTypeField(SchemaField field, Object value, float boost) {
		String mimeType = extractMimeType(value);
		return new SortedDocValuesField(field.getName(), new BytesRef(mimeType));
	}

	private String extractMimeType(Object value) {
		if (value instanceof byte[])
			return extractMimeType((byte[]) value);
		else if (value instanceof ByteBuffer)
			return extractMimeType((ByteBuffer) value);
		else
			return extractMimeType(value.toString());
	}

	private String extractMimeType(byte[] value) {
		try {
			BinaryData binary = new BinaryData(value, 0, false);
			return binary.getMimeType();
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO: log
		}
	}

	private String extractMimeType(ByteBuffer value) {
		try {
			if (value.hasArray()) {
				BinaryData binary = new BinaryData(value.array(), value.arrayOffset(), false);
				return binary.getMimeType();
			} else {
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				int oldPos = value.position();
				int length = value.getInt();
				output.write(length);
				byte[] data = new byte[length];
				value.get(data);
				output.write(data);
				output.flush();
				value.position(oldPos);
				return extractMimeType(output.toByteArray());
			}
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO: log
		}
	}

	private String extractMimeType(String value) {
		try {
			// decode just enough chars to read the mime type length
			String segment = value.toString().substring(0, 8); // each char is 6 bits, we need 32 bits, we must read multiples of 4 chars
			byte[] data = Base64.base64ToByteArray(segment);
			ByteBuffer buffer = ByteBuffer.wrap(data);
			int length = buffer.getInt();
			// now we know how many chars we need in total
			length = ( 7 + (( length * 4 ) / 3) ) & ~0x00000003; // we must read multiples of 4 chars
			segment = value.toString().substring(0, length);
			data = Base64.base64ToByteArray(segment);
			BinaryData binary = new BinaryData(data, 0, false);
			return binary.getMimeType();
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO: log
		}
	}
	
	@Override 
	public Type getUninversionType(SchemaField field) { 
		if (field.multiValued()) { 
			return Type.SORTED_SET_BINARY; 
		} else { 
			return Type.SORTED; 
		} 
	}
	
	@Override public SortField getSortField(SchemaField field, boolean reverse) { 
		return getStringSort(field, reverse); 
	}
	 
}
