package prompto.code;

import java.util.Collections;
import java.util.List;

import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;

public class WebLibrary extends Library {

	String htmlEngine;
	@Deprecated String widgetLibrary;
	@Deprecated String uiFramework;
	String stubResource;
	List<String> javaScripts;
	List<String> styleSheets;
	List<String> resources;
	
	@Override
	public ModuleType getType() {
		return ModuleType.WEBLIBRARY;
	}

	public String getHtmlEngine() {
		return htmlEngine;
	}

	public void setHtmlEngine(String htmlEngine) {
		this.htmlEngine = htmlEngine;
	}

	public String getStubResource() {
		return stubResource;
	}
	
	public void setStubResource(String stubResource) {
		this.stubResource = stubResource;
	}
	
	public List<String> getJavaScripts() {
		return javaScripts;
	}

	public void setJavaScripts(List<String> javaScripts) {
		this.javaScripts = javaScripts;
	}

	public List<String> getStyleSheets() {
		return styleSheets;
	}

	public void setStyleSheets(List<String> styleSheets) {
		this.styleSheets = styleSheets;
	}

	public List<String> getResources() {
		return resources;
	}

	public void setResources(List<String> resources) {
		this.resources = resources;
	}
	
	@Override
	public IStorable collectStorables(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		IStorable storable = super.collectStorables(context, store, storables);
		if(htmlEngine!=null)
			storable.setData("htmlEngine", htmlEngine);
		if(widgetLibrary!=null)
			storable.setData("widgetLibrary", widgetLibrary);
		if(uiFramework!=null)
			storable.setData("uiFramework", uiFramework);
		if(stubResource!=null)
			storable.setData("stubResource", stubResource);
		if(javaScripts!=null && !javaScripts.isEmpty())
			storable.setData("javaScripts", javaScripts);
		if(styleSheets!=null && !styleSheets.isEmpty())
			storable.setData("styleSheets", styleSheets);
		if(resources!=null && !resources.isEmpty())
			storable.setData("resources", resources);
		return storable;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void fromStored(IStore store, IStored stored) {
		super.fromStored(store, stored);
		Object value = stored.getData("htmlEngine");
		if(value instanceof String)
			setHtmlEngine((String)value);
		value = stored.getData("widgetLibrary");
		if(value instanceof String)
			setWidgetLibrary((String)value);
		value = stored.getData("uiFramework");
		if(value instanceof String)
			setUiFramework((String)value);
		value = stored.getData("stubResource");
		if(value instanceof String)
			setStubResource((String)value);
		value = stored.getData("javaScripts");
		if(value instanceof List)
			setJavaScripts((List<String>)value);
		else {
			value = stored.getData("nativeResource");
			if(value instanceof String)
				setJavaScripts(Collections.singletonList((String)value));
		}
		value = stored.getData("styleSheets");
		if(value instanceof List)
			setStyleSheets((List<String>)value);
		value = stored.getData("resources");
		if(value instanceof List)
			setResources((List<String>)value);
	}

	@Deprecated
	public String getWidgetLibrary() {
		return widgetLibrary;
	}

	@Deprecated
	public void setWidgetLibrary(String widgetLibrary) {
		this.widgetLibrary = widgetLibrary;
	}
	
	@Deprecated
	public String getUiFramework() {
		return uiFramework;
	}
	
	@Deprecated
	public void setUiFramework(String uiFramework) {
		this.uiFramework = uiFramework;
	}



}

