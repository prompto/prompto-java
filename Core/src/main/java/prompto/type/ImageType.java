package prompto.type;

import java.lang.reflect.Type;

import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.ImageValue;

public class ImageType extends BinaryType { 

	static ImageType instance = new ImageType();
	
	public static ImageType instance() {
		return instance;
	}
	
	private ImageType() {
		super(Family.IMAGE);
	}

	@Override
	public Type getJavaType(Context context) {
		return ImageValue.class;
	}
	
	@Override
	protected IValue newInstance(PromptoBinary binary) {
		return new ImageValue(binary);
	}

	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do for now
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		// nothing to do for now
	}
	
}
