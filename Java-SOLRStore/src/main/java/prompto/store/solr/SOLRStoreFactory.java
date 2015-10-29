package prompto.store.solr;

import java.io.File;
import java.lang.reflect.Constructor;

import prompto.store.IStore;
import prompto.store.IStoreFactory;

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
			return newEmbeddedSOLRStore(root);
		else
			return new RemoteSOLRStore();
	}

	private IStore newEmbeddedSOLRStore(String root) throws Exception {
		// this is test only, load class by name to avoid carrying SOLR jars with each executable
		Class<?> klass = Class.forName("prompto.store.solr.EmbeddedSOLRStore");
		Constructor<?> ctor = klass.getConstructor(File.class);
		return (IStore)ctor.newInstance(new File(root));
	}
}
