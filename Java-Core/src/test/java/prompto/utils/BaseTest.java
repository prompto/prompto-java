package prompto.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BaseTest {

	public String getResourceAsString(String resourceName) throws Exception {
		char[] data = new char[4096];
		InputStream stream = getResourceAsStream(resourceName);
		Reader reader = new InputStreamReader(stream);
		StringBuffer buffer = new StringBuffer();
		for(;;) {
			int read = reader.read(data);
			if(read==-1)
				break;
			buffer.append(data, 0, read);
		}
		stream.close();
		return buffer.toString();
	}

	public InputStream getResourceAsStream(String resourceName) throws Exception {
		InputStream stream = tryLoadResource(resourceName);
		if(stream==null)
			stream = tryLoadRuntimeFile(resourceName);
		if(stream==null)
			stream = tryLoadLibraryFile(resourceName);
		return stream;
	}

	private InputStream tryLoadLibraryFile(String resourceName) throws FileNotFoundException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String dirPath = loader.getResource("").getFile();
		int idx = dirPath.lastIndexOf("/Java-Runtime/");
		if(idx<0)
			return null;
		String libsPath = dirPath.substring(0, idx) + "/prompto-libraries/";
		File file = new File(libsPath + resourceName);
		if(file.exists())
			return new FileInputStream(file);
		else
			return null;
	}
	
	public File[] listLibraryFiles(String libraryName) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String dirPath = loader.getResource("").getFile();
		int idx = dirPath.lastIndexOf("/Java-Runtime/");
		if(idx<0)
			return null;
		String libsPath = dirPath.substring(0, idx) + "/prompto-libraries/";
		File file = new File(libsPath + libraryName);
		if(file.exists())
			return file.listFiles(new FilenameFilter() {
				@Override public boolean accept(File dir, String name) {
					return name.endsWith(".pec")
							|| name.endsWith(".poc")
							|| name.endsWith(".psc");
				}
			});
		else
			return null;
	}

	private InputStream tryLoadRuntimeFile(String resourceName) throws FileNotFoundException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String dirPath = loader.getResource("").getFile();
		int idx = dirPath.lastIndexOf("/Java-Core/");
		if(idx<0)
			return null;
		String testsPath = dirPath.substring(0, idx) + "/prompto-tests/Tests/resources/";
		File file = new File(testsPath + resourceName);
		if(file.exists())
			return new FileInputStream(file);
		else
			return null;
	}

	private InputStream tryLoadResource(String resourceName) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		return loader.getResourceAsStream(resourceName);
	}

}
