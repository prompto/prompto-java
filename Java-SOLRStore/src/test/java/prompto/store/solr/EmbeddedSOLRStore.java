package prompto.store.solr;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.core.CoreContainer;
import org.apache.solr.core.CoreDescriptor;
import org.apache.solr.core.SolrCore;
import org.apache.solr.schema.CopyField;
import org.apache.solr.schema.IndexSchema;
import org.apache.solr.schema.SchemaField;

import prompto.error.InternalError;
import prompto.error.PromptoError;

public class EmbeddedSOLRStore extends BaseSOLRStore {

	File root;
	String coreName;
	CoreContainer container;
	SolrCore core;
	EmbeddedSolrServer server;
	int commitDelay = 15000; // ms
	
	public EmbeddedSOLRStore(File root, String coreName) {
		this.root = root;
		this.coreName = coreName;
	}
	
	@Override
	public void setCommitDelay(int commitDelay) throws SolrServerException {
		this.commitDelay = commitDelay;
	}

	public void startContainer() {
		if(container==null) {
			CoreContainer container = new CoreContainer(root.getAbsolutePath());
			container.load();
			this.container = container;
		}
	}

	public void startServerWithEmptyCore() throws SolrServerException, IOException {
		createCoreIfRequired();
		if(server==null)
			server = new EmbeddedSolrServer(container, coreName);
	}
	
	@Override
	public void createCoreIfRequired() throws SolrServerException, IOException {
		if(core==null) {
			File coreDir = new File(root, coreName);
			if(coreDir.exists())
				delete(coreDir);
			File confDir = new File(coreDir, "conf");
			confDir.mkdir();
			copyResourceToFile("solr/solrconfig.xml", new File(confDir, "solrconfig.xml"));
			copyResourceToFile("solr/emptyschema.xml", new File(confDir, "schema.xml"));
			copyResourceToFile("solr/stopwords.txt", new File(confDir, "stopwords.txt"));
			copyResourceToFile("solr/update-script.js", new File(confDir, "update-script.js"));
			CoreDescriptor cd = new CoreDescriptor(container, coreName, coreDir.getAbsolutePath());
			core = container.create(cd);
		}
	}
	
	@Override
	public void dropCoreIfExists() throws SolrServerException, IOException {
		container.unload(coreName, true, true, true);
		core = null;
	}
	
	private void delete(File file) {
		if(!file.exists())
			return;
		if(file.isDirectory()) for(String name : file.list())
			delete(new File(file, name));
		file.delete();
	}

	private void copyResourceToFile(String resourcePath, File destination) throws IOException {
		URL inputUrl = Thread.currentThread().getContextClassLoader().getResource(resourcePath);
		FileUtils.copyURLToFile(inputUrl, destination);	
	}

	public void shutdownServer() throws IOException {
		if(server!=null) {
			server.close();
			server = null;
		}
	}
	
	public void shutdownCore() {
		if(core!=null) {
			if(!core.isClosed())
				core.close();
			core = null;
		}
	}
	
	public void shutdownContainer() {
		if(container!=null) {
			if(!container.isShutDown())
				container.shutdown();
			container = null;
		}
	}

	@Override
	public QueryResponse query(SolrQuery query) throws SolrServerException, IOException {
		return server.query(query);
	}

	@Override
	public void addDocuments(Collection<SolrInputDocument> docs) throws SolrServerException, IOException {
		server.add(docs, commitDelay);
	}

	@Override
	public void dropDocuments(List<String> dbIds) throws SolrServerException, IOException {
		server.deleteById(dbIds, commitDelay);
	}
	
	@Override
	public void delete(Collection<?> dbIds) throws PromptoError {
		try {
			for(Object dbId : dbIds)
				server.deleteById(String.valueOf(dbId), commitDelay);
		} catch(IOException | SolrServerException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public void deleteAll() throws PromptoError {
		try {
			server.deleteByQuery("*:*", commitDelay);
		} catch(IOException | SolrServerException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public void flush() throws PromptoError {
		try {
			server.commit();
		} catch(SolrServerException | IOException e) {
			throw new InternalError(e);
		}
	}

	@Override
	public boolean hasField(String fieldName) {
		IndexSchema schema = core.getLatestSchema();
		return schema.hasExplicitField(fieldName) || schema.hasExplicitField(fieldName + "-key")
				 || schema.hasExplicitField(fieldName + "-value") || schema.hasExplicitField(fieldName + "-words");
	}
	
	@Override
	public void addField(String fieldName, String fieldType, Map<String, Object> options) {
		IndexSchema schema = core.getLatestSchema();
		Object lock = schema.getSchemaUpdateLock();
		synchronized(lock) {
			SchemaField field = schema.newField(fieldName, fieldType, options);
			schema = schema.addField(field);
			schema.refreshAnalyzers();
		}
		core.setLatestSchema(schema);
	}
	
	@Override
	public void addCopyField(String fieldName, String fieldType, Map<String, Object> options, String sourceName) {
		IndexSchema schema = core.getLatestSchema();
		Object lock = schema.getSchemaUpdateLock();
		synchronized(lock) {
			SchemaField field = schema.newField(fieldName, fieldType, options);
			schema = schema.addField(field);
			schema = schema.addCopyFields(sourceName, Arrays.asList(fieldName), CopyField.UNLIMITED);
			schema.refreshAnalyzers();
		}
		core.setLatestSchema(schema);
	}
	
	@Override
	public String getFieldType(String fieldName) {
		IndexSchema schema = core.getLatestSchema();
		SchemaField field = schema.getField(fieldName);
		return field.getType().getTypeName() + (field.multiValued() ? "[]" : "");
	}
	
	@Override
	public void dropField(String fieldName) throws SolrServerException, IOException {
		IndexSchema schema = core.getLatestSchema();
		Object lock = schema.getSchemaUpdateLock();
		synchronized(lock) {
			schema = schema.deleteFields(Arrays.asList(fieldName));
			schema.refreshAnalyzers();
		}
		core.setLatestSchema(schema);
	}

}
