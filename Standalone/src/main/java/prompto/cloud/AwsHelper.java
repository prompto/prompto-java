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
	
	private Boolean isThisCloud = null;
	
	@Override
	public boolean checkHost() {
		if(isThisCloud==null)
			isThisCloud = checkThisCloud();
		return isThisCloud;
	}
	
	@Override
	public Collection<URL> getJarURLs() {
		if(!checkHost())
			return null;
		File awsDir = new File("/AwsClient/");
		return Stream.of(awsDir.listFiles())
				.map(File::toURI)
				.map(this::safeURItoURL)
				.collect(Collectors.toList());
	}
	
	URL safeURItoURL(URI uri) {
		try {
			return uri.toURL();
		} catch(MalformedURLException e) {
			throw new RuntimeException(); // will never happen in this context
		}
	}

	private Boolean checkThisCloud() {
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

} /*
path = "file:/sys/devices/virtual/dmi/id/bios_version"
data = read all from Url with path as path
return "amazon" in data
*/