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
		BaseSOLRStore store = newStoreFromArgs(args, type);
		store.createCoreIfRequired();
		return store;
	}

	private BaseSOLRStore newStoreFromArgs(String[] args, Type type) throws Exception {
		boolean embedded = false;
		String root = null;
		String protocol = "http";
		String server = null;
		int port = 8983;
		
		final String argKey = "-" + type.name().toLowerCase() + "-solr" + "-";
		for(int i=0;i<args.length;i++) {
			if(!args[i].toLowerCase().startsWith(argKey))
				continue;
			String arg = args[i].substring(argKey.length());
			if(arg.equalsIgnoreCase("embedded"))
				embedded = true;
			else if(arg.equalsIgnoreCase("root"))
				root = args[++i];
			else if(arg.equalsIgnoreCase("protocol"))
				protocol = args[++i];
			else if(arg.equalsIgnoreCase("server"))
				server = args[++i];
			else if(arg.equalsIgnoreCase("port"))
				port = Integer.decode(args[++i]);
		}
		if(embedded)
			return newEmbeddedSOLRStore(root, type);
		else
			return newRemoteSOLRStore(protocol, server, port, type);
	}

	private BaseSOLRStore newRemoteSOLRStore(String protocol, String host, int port, Type type) {
		return new RemoteSOLRStore(protocol, host, port, type);
	}

	private BaseSOLRStore newEmbeddedSOLRStore(String root, Type type) throws Exception {
		// this is test only, load class by name to avoid carrying SOLR jars with each executable
		@SuppressWarnings("unchecked")
		Class<? extends BaseSOLRStore> klass = (Class<? extends BaseSOLRStore>) Class.forName("prompto.store.solr.EmbeddedSOLRStore");
		Constructor<? extends BaseSOLRStore> ctor = klass.getConstructor(File.class, String.class);
		String coreName = Utils.capitalizeFirst(type.name()) + "Store";
		BaseSOLRStore store = ctor.newInstance(new File(root), coreName);
		Method method = klass.getDeclaredMethod("startContainer");
		method.invoke(store);
		method = klass.getDeclaredMethod("startServerWithEmptyCore");
		method.invoke(store);
		return store;
	}
}
