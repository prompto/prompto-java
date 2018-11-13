package prompto.cloud;

import java.net.URL;
import java.util.Collection;

import prompto.utils.Logger;

public enum Cloud {
	AWS(new AwsHelper())
	;
	
	static Logger logger = new Logger();
	
	Helper helper;
	
	Cloud(Helper helper) {
		this.helper = helper;
	}

	public boolean checkHost() {
		return helper.checkHost();
	}

	public Collection<URL> getJarURsL() {
		return helper.getJarURLs();
	}

	public static Cloud current() {
		logger.info(()->"Checking current cloud...");
		for(Cloud cloud : values()) {
			if(cloud.checkHost()) {
				logger.info(()->"Running on " + cloud.name() + " cloud.");
				return cloud;
			}
		}
		logger.info(()->"Not running on cloud.");
		return null;
	}
	
	interface Helper {

		boolean checkHost();
		Collection<URL> getJarURLs();
	}

}
