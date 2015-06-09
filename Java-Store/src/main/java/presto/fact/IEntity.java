package presto.fact;

import java.util.Collection;

public interface IEntity {
	
	ISnapshot snapshot();
	IDbId dbId();
	Collection<IFact> facts();
	IFact fact(String attribute);
}
