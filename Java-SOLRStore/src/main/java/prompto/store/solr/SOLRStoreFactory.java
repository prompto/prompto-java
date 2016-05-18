package prompto.store.solr;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import prompto.store.IStoreFactory;
import prompto.utils.StringUtils;

public class SOLRStoreFactory implements IStoreFactory {

	@Override
	public BaseSOLRStore newStore(String[] args, Type type) throws Exception {
		BaseSOLRStore store = newStoreFromArgs(args, type);
		store.createCoreIfRequired();
		return store;
	}

	private BaseSOLRStore newStoreFromArgs(String[] args, Type type) throws Exception {
		boolean embedded = false;
		String root = null;
		String protocol = "http";
		String server = null;
		int commitDelay = 15000;
		int port = 8983;
		
		final String argKey = "-solr-" + type.name().toLowerCase() + "-";
		for(int i=0;i<args.length;i++) {
			String arg = args[i]; 
			if(!arg.toLowerCase().startsWith(argKey))
				continue;
			arg = arg.substring(argKey.length());
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
			else if(arg.equalsIgnoreCase("commitDelay"))
				commitDelay = Integer.decode(args[++i]);
		}
		BaseSOLRStore store = null;
		if(embedded)
			store = newEmbeddedSOLRStore(root, type);
		else
			store = newRemoteSOLRStore(protocol, server, port, type);
		store.setCommitDelay(commitDelay);
		return store;
	}

	private BaseSOLRStore newRemoteSOLRStore(String protocol, String host, int port, Type type) {
		return new RemoteSOLRStore(protocol, host, port, type);
	}

	private BaseSOLRStore newEmbeddedSOLRStore(String root, Type type) throws Exception {
		// this is test only, load class by name to avoid carrying SOLR jars with each executable
		@SuppressWarnings("unchecked")
		Class<? extends BaseSOLRStore> klass = (Class<? extends BaseSOLRStore>) Class.forName("prompto.store.solr.EmbeddedSOLRStore");
		Constructor<? extends BaseSOLRStore> ctor = klass.getConstructor(File.class, String.class);
		String coreName = StringUtils.capitalizeFirst(type.name()) + "Store";
		BaseSOLRStore store = ctor.newInstance(new File(root), coreName);
		Method method = klass.getDeclaredMethod("startContainer");
		method.invoke(store);
		method = klass.getDeclaredMethod("startServerWithEmptyCore");
		method.invoke(store);
		return store;
	}
}
