package prompto.compiler;

public interface IInstruction {

	void rehearse(CodeAttribute code);
	void register(ConstantsPool pool);
	void writeTo(ByteWriter writer);

}
