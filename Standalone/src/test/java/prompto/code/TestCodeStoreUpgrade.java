package prompto.code;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import prompto.config.IRuntimeConfiguration;
import prompto.config.TempDirectories;
import prompto.intrinsic.PromptoVersion;
import prompto.libraries.Libraries;
import prompto.runtime.Standalone;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.memory.MemStore;
import prompto.utils.Instance;

public class TestCodeStoreUpgrade {
	
	@Test
	public void upgradesDerivedFrom() throws Exception {
		Instance<Object> dbId = new Instance<>();
		IStore store = new MemStore();
		IStorable storable = store.newStorable(Arrays.asList("Declaration", "CategoryDeclaration", "ConcreteCategoryDeclaration"), new IDbIdFactory() {
			@Override public void accept(Object id) { dbId.set(id); }
			@Override public Object get() { return null; }
			@Override public boolean isUpdate() { return false; }
		});
		storable.setData("name", "Child");
		storable.setData("dialect", "O");
		storable.setData("body", "category Child extends Parent, Uncle;");
		store.store(storable);
		TempDirectories.create();
		Collection<URL> libs = Libraries.getPromptoLibraries(Libraries.class);
		IRuntimeConfiguration config = new IRuntimeConfiguration.Inline()
				.withApplicationName("test")
				.withApplicationVersion(PromptoVersion.LATEST)
				.withRuntimeLibs(()->libs);
		Standalone.bootstrapCodeStore(store, config);
		IStored stored = store.fetchUnique(dbId.get());
		assertEquals(Arrays.asList("Parent", "Uncle"), stored.getData("derivedFrom"));
	}

}
