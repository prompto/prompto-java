package prompto.compiler;

interface Attribute {

	void register(ConstantsPool pool);
	void writeTo(ByteWriter writer);

}
