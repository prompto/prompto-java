package prompto.compiler;

abstract class Attribute {

	abstract void register(ConstantsPool pool);
	abstract void writeTo(ByteWriter writer);

}
