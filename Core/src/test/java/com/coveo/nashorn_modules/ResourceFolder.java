package com.coveo.nashorn_modules;

import java.io.IOException;

import prompto.utils.StreamUtils;

public class ResourceFolder extends AbstractFolder {
  private ClassLoader loader;
  private String resourcePath;
  private String encoding;

  @Override
  public String getFile(String name) {
    try(var stream = loader.getResourceAsStream(resourcePath + "/" + name)) {
	    if (stream == null) {
	      return null;
	    }
	
	    try {
	      return StreamUtils.readString(stream); // IOUtils.toString(stream, encoding);
	    } catch (IOException ex) {
	      return null;
	    }
    } catch(IOException e) {
    	throw new RuntimeException(e);
    }
  }

  @Override
  public Folder getFolder(String name) {
    return new ResourceFolder(
        loader, resourcePath + "/" + name, this, getPath() + name + "/", encoding);
  }

  private ResourceFolder(
      ClassLoader loader, String resourcePath, Folder parent, String displayPath, String encoding) {
    super(parent, displayPath);
    this.loader = loader;
    this.resourcePath = resourcePath;
    this.encoding = encoding;
  }

  public static ResourceFolder create(ClassLoader loader, String path, String encoding) {
    return new ResourceFolder(loader, path, null, "/", encoding);
  }
}
