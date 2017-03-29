package prompto.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;

import org.junit.Test;

public class TestResourceUtils {

	@Test
	public void testListResourcesAtRoot() throws IOException {
		Collection<URL> names = ResourceUtils.listResourcesAt("/");
		assertNotNull(names);
		assertFalse(names.isEmpty());
	}

	@Test
	public void testListResourcesAtFolder() throws IOException {
		Collection<URL> names = ResourceUtils.listResourcesAt("prompto/");
		assertNotNull(names);
		assertFalse(names.isEmpty());
	}
	
	@Test
	public void testListResourcesAtJarFolder() throws IOException {
		Collection<URL> names = ResourceUtils.listResourcesAt("org/abego/treelayout/");
		assertNotNull(names);
		assertFalse(names.isEmpty());
	}


}
