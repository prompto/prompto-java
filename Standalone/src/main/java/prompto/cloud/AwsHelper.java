package prompto.cloud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class AwsHelper implements Cloud.Helper {
	
	private Boolean isAWS = null;
	
	@Override
	public boolean checkHost() {
		if(isAWS==null)
			isAWS = checkIsAWS();
		return isAWS;
	}
	
	@Override
	public Collection<URL> getJarURLs() {
		File awsDir = new File("/AwsClient/");
		if(awsDir.exists())
			return Stream.of(awsDir.listFiles())
					.filter(file->file.isFile())
					.filter(file->file.getAbsolutePath().endsWith(".jar"))
					.map(File::toURI)
					.map(this::safeURItoURL)
					.collect(Collectors.toList());
		else
			return null;
	}
	
	URL safeURItoURL(URI uri) {
		try {
			return uri.toURL();
		} catch(MalformedURLException e) {
			throw new RuntimeException(); // will never happen in this context
		}
	}

	private Boolean checkIsAWS() {
		try {
			try(Reader reader = new FileReader("/sys/devices/virtual/dmi/id/bios_version")) {
				try(BufferedReader buffer = new BufferedReader(reader)) {
					for(;;) {
						String line = buffer.readLine();
						if(line==null)
							return false;
						if(line.toLowerCase().contains("amazon"))
							return true;
					}
				}
			}
		} catch(IOException e) {
			return false;
		}
	}

	@Override
	public boolean isInClassPath() {
		try {
			Class.forName("prompto.aws.EC2");
			return true;
		} catch(Throwable t) {
			return false;
		}
	}

} /*
path = "file:/sys/devices/virtual/dmi/id/bios_version"
data = read all from Url with path as path
return "amazon" in data
*/