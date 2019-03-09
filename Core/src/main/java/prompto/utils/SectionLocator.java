package prompto.utils;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import prompto.declaration.IDeclaration;
import prompto.parser.ISection;

public class SectionLocator {

	public static ISection locateSection(Collection<IDeclaration> declarations, ISection section) {
		return declarations.stream()
				.map(d->d.locateSection(section))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

	public static ISection findSectionInLists(Collection<List<IDeclaration>> values, ISection section) {
		return values.stream()
			.map(Collection::stream)
			.flatMap(s->s)
			.map(d->d.locateSection(section))
			.filter(Objects::nonNull)
			.findFirst()
			.orElse(null);
	}


}
