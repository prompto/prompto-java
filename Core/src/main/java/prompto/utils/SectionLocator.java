package prompto.utils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import prompto.declaration.IDeclaration;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;

public class SectionLocator {

	public static ICodeSection locateCodeSection(Collection<IDeclaration> declarations, ISection section) {
		return declarations.stream()
				.map(d->d.locateCodeSection(section))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

	public static ICodeSection findCodeSectionInLists(Collection<List<IDeclaration>> values, ISection section) {
		return values.stream()
			.map(Collection::stream)
			.flatMap(s->s)
			.map(d->d.locateCodeSection(section))
			.filter(Objects::nonNull)
			.findFirst()
			.orElse(null);
	}


}
