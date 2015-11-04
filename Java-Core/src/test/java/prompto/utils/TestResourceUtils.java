package prompto.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collection;

import org.junit.Test;

public class TestResourceUtils {

	@Test
	public void testListResourcesAtRoot() throws IOException {
		Collection<String> names = ResourceUtils.listResourcesAt("/");
		assertNotNull(names);
		assertFalse(names.isEmpty());
	}

	@Test
	public void testListResourcesAtFolder() throws IOException {
		Collection<String> names = ResourceUtils.listResourcesAt("prompto/");
		assertNotNull(names);
		assertFalse(names.isEmpty());
	}

}
