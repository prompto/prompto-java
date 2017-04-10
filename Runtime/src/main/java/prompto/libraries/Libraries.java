package prompto.libraries;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;

import prompto.utils.ResourceUtils;

public abstract class Libraries {

	public static Collection<URL> getRuntimeResources() {
		return getRuntimeResources(Libraries.class);
	}
	
	public static Collection<URL> getRuntimeResources(Class<?> klass) {
			try {
			String thisClassName = klass.getName().replace('.', '/') + ".class";
			URL thisResourceUrl = klass.getClassLoader().getResource(thisClassName);
			String thisResourceName = thisResourceUrl.toExternalForm();
			URL parentUrl = new URL(thisResourceName.substring(0, thisResourceName.indexOf(thisClassName)));
			URL url = new URL(parentUrl.toExternalForm() + "libraries/");
			return ResourceUtils.listResourcesAt(url, ResourceUtils::isPrompto);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}

}
