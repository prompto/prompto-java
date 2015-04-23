package presto.declaration;

import presto.grammar.Identifier;
import presto.grammar.MethodDeclarationList;
import presto.grammar.NativeAttributeBindingListMap;
import presto.grammar.NativeCategoryBindingList;
import presto.utils.IdentifierList;

public class AnyNativeCategoryDeclaration extends NativeCategoryDeclaration {
	
	static private AnyNativeCategoryDeclaration instance = new AnyNativeCategoryDeclaration();
	
	static public AnyNativeCategoryDeclaration getInstance() {
		return instance;
	}
	
	private AnyNativeCategoryDeclaration() {
		super(new Identifier("Any"), new IdentifierList(), 
				new NativeCategoryBindingList(), 
				new NativeAttributeBindingListMap(),
				new MethodDeclarationList());
	}

}
