package prompto.store.solr;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import prompto.store.IStore;
import prompto.store.IStoreFactory;
import prompto.utils.Utils;

public class SOLRStoreFactory implements IStoreFactory {

	@Override
	public IStore newStore(String[] args, Type type) throws Exception {
		boolean embedded = false;
		String root = null;
		
		final String argKey = "-" + type.name().toLowerCase() + "-solr" + "-";
		for(int i=0;i<args.length;i++) {
			if(!args[i].toLowerCase().startsWith(argKey))
				continue;
			String arg = args[i].substring(argKey.length());
			if(arg.equalsIgnoreCase("embedded"))
				embedded = true;
			else if(arg.equalsIgnoreCase("root"))
				root = args[++i];
		}
		if(embedded)
			return newEmbeddedSOLRStore(root, type);
		else
			return newRemoteSOLRStore(type);
	}

	private IStore newRemoteSOLRStore(Type type) {
		return new RemoteSOLRStore(type);
	}

	private IStore newEmbeddedSOLRStore(String root, Type type) throws Exception {
		// this is test only, load class by name to avoid carrying SOLR jars with each executable
		@SuppressWarnings("unchecked")
		Class<? extends BaseSOLRStore> klass = (Class<? extends BaseSOLRStore>) Class.forName("prompto.store.solr.EmbeddedSOLRStore");
		Constructor<? extends BaseSOLRStore> ctor = klass.getConstructor(File.class);
		BaseSOLRStore store = ctor.newInstance(new File(root));
		Method method = klass.getDeclaredMethod("startContainer");
		method.invoke(store);
		method = klass.getDeclaredMethod("startServerWithEmptyCore", String.class);
		String name = Utils.capitalizeFirst(type.name()) + "Store";
		method.invoke(store, name);
		return store;
	}
}
