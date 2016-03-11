package prompto.compiler;

public abstract class StackLocal implements StackEntry {

	Type type;
	String name;
	int index = -1;
	
	public StackLocal(Type type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		if(index==-1)
			throw new CompilerException("Local not registered: " + name); 
		return index;
	}

	static class ObjectLocal extends StackLocal {

		String className;
		
		public ObjectLocal(Type type, String name, String className) {
			super(type, name);
			this.className = className;
		}
		
	}
	
	static class ThisLocal extends ObjectLocal {

		public ThisLocal(String className) {
			super(Type.ITEM_UninitializedThis, "this", className);
		}
		
	}

	static class NativeLocal extends StackLocal{

		public NativeLocal(Type type, String name) {
			super(type, name);
		}
		
	}


	
}
