package prompto.parser;

public interface ICodeSection {
	
	ISection getSection();
	void setSection(ISection section);
	default void setSectionFrom(ICodeSection codeSection) {
		setSection(codeSection.getSection());
	}
	default boolean isOrContains(ICodeSection codeSection) {
		return isOrContains(codeSection.getSection());
	}
	default boolean isOrContains(ISection section) {
		return getSection().isOrContains(section);
	}
	default Dialect getDialect() {
		return getSection() != null ? getSection().getDialect() : null;
	}
	default int computeStartLine() {
		return getSection().computeStartLine();
	}

}
