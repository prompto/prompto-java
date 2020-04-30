package prompto.store;

public class FamilyInfo {

	protected Family family;
	protected boolean collection;
	
	public FamilyInfo(Family family, boolean collection) {
		this.family = family;
		this.collection = collection;
	}
	
	public Family getFamily() {
		return family;
	}
	
	public boolean isCollection() {
		return collection;
	}
	
	@Override
	public String toString() {
		return family.name() + (collection ? "[]" : "");
	}

}
