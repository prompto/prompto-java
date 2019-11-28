package prompto.code;

import java.util.List;

import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;

public class WebLibrary extends Library {

	String widgetLibrary;
	String htmlEngine;
	String uiFramework;
	String nativeResource;
	String stubResource;
	
	@Override
	public ModuleType getType() {
		return ModuleType.WEBLIBRARY;
	}

	public String getWidgetLibrary() {
		return widgetLibrary;
	}

	public void setWidgetLibrary(String widgetLibrary) {
		this.widgetLibrary = widgetLibrary;
	}
	
	public String getNativeResource() {
		return nativeResource;
	}
	
	public void setNativeResource(String nativeResource) {
		this.nativeResource = nativeResource;
	}
	
	public String getStubResource() {
		return stubResource;
	}
	
	public void setStubResource(String stubResource) {
		this.stubResource = stubResource;
	}

	public String getHtmlEngine() {
		return htmlEngine;
	}

	public void setHtmlEngine(String htmlEngine) {
		this.htmlEngine = htmlEngine;
	}

	public String getUIFramework() {
		return uiFramework;
	}
	
	public void setUIFramework(String uiFramework) {
		this.uiFramework = uiFramework;
	}

	@Override
	public IStorable collectStorables(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		IStorable storable = super.collectStorables(context, store, storables);
		storable.setData("widgetLibrary", widgetLibrary);
		storable.setData("htmlEngine", htmlEngine);
		storable.setData("uiFramework", uiFramework);
		storable.setData("nativeResource", nativeResource);
		storable.setData("stubResource", stubResource);
		return storable;
	}

	@Override
	public void fromStored(IStore store, IStored stored) {
		super.fromStored(store, stored);
		setWidgetLibrary((String)stored.getData("widgetLibrary"));
		setHtmlEngine((String)stored.getData("htmlEngine"));
		setUIFramework((String)stored.getData("uiFramework"));
		setNativeResource((String)stored.getData("nativeResource"));
		setStubResource((String)stored.getData("stubResource"));
	}

}

