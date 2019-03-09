package prompto.grammar;

import java.util.LinkedList;
import java.util.Objects;

import prompto.declaration.IMethodDeclaration;
import prompto.parser.ISection;

public class MethodDeclarationList extends LinkedList<IMethodDeclaration> {

	private static final long serialVersionUID = 1L;

	public MethodDeclarationList() {
	}

	public MethodDeclarationList(IMethodDeclaration method) {
		this.add(method);
	}

	public ISection locateSection(ISection section) {
		return this.stream()
				.map(m->m.locateSection(section))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

}
