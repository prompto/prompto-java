package prompto.type;

import java.util.HashMap;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;



public class TypeMap extends HashMap<Identifier, IType> {

	private static final long serialVersionUID = 1L;

	public IType inferType(Context context) {
		if(size()==0)
			return VoidType.instance();
		IType inferred = null;
		// first pass: get less specific type
		for(IType t : values()) {
			if(t==NullType.instance())
				continue;
			if(inferred==null)
				inferred = t;
			else if(inferred.isAssignableFrom(context, t))
				continue;
			else if(t.isAssignableFrom(context, inferred))
				inferred = t;
			else
				throw new SyntaxError("Incompatible types: " + inferred.getTypeName() + " and " + t.getTypeName());
		}
		if(inferred==null)
			return NullType.instance();
		// second pass: check compatible
		for(IType t : values()) {
			if(t!=inferred && !inferred.isAssignableFrom(context, t))
				throw new SyntaxError("Incompatible types: " + inferred.getTypeName() + " and " + t.getTypeName());
		}
		return inferred;
	}
	
}
