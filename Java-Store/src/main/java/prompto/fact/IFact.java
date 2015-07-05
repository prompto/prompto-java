package prompto.fact;

public interface IFact {
	IEntity entity(); // entity to which this fact relates
	IAttribute attribute(); // attribute defining this fact 
	IValue value(); // value of the attribute, can be a literal, a collection or a reference
	ITransaction birth(); // on supporting stores, transaction which made this fact true
	ITransaction death(); // on supporting stores, IDbId.INFINITE, or transaction which made this fact false
}
