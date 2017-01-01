package prompto.libraries;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;

import prompto.utils.ResourceUtils;

public abstract class Libraries {

	public static Collection<String> getRuntimeResources() throws IOException {
		URL url = Libraries.class.getResource("/libraries/");
		return ResourceUtils.listResourcesAt(url);
	}

}
