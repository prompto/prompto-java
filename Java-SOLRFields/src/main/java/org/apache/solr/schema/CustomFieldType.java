package org.apache.solr.schema;

import java.util.Map;

/* need this peer class to enable execution of protected methods */
public abstract class CustomFieldType extends FieldType {

	protected static void setFieldTypeName(FieldType fieldType, String typeName) {
		fieldType.setTypeName(typeName);
	}

	protected static void initFieldType(FieldType fieldType, IndexSchema schema, Map<String, String> args) {
	    fieldType.init(schema, args);
	}

	protected static int calculateProps(String name, FieldType type, Map<String, String> props) {
		return SchemaField.calcProps(name, type, props);
	}

	protected static SchemaField createSchemaField(String name, FieldType type, int mask, String defValue) {
		return SchemaField.create(name, type, mask, defValue);
	}


}
