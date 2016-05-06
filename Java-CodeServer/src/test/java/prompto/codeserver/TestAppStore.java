package prompto.codeserver;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import prompto.server.AppServer;

public class TestAppStore extends BaseWebTest {

	@BeforeClass
	public static void startCodeServer() throws Throwable {
		String[] args = {
				"-testMode",
				"true",
				"-http_port",
				"8888",
				"-codeStoreFactory",
				"prompto.store.solr.SOLRStoreFactory",
				"-dataStoreFactory",
				"prompto.store.solr.SOLRStoreFactory",
				"-solr-root-embedded",
				"-solr-root-root",
				"target/test-classes/solr-test",
				"-solr-code-embedded",
				"-solr-code-root",
				"target/test-classes/solr-test"
		};
		Application.main(args);
	}
	
	@AfterClass
	public static void stopCodeServer() throws Exception {
		AppServer.stop();
	}
	
	
	static final String ROOT_URL = "http://localhost:8888/";
	static final String EDITOR_URL = ROOT_URL + "ide/index.html?dbId=$dbId$&name=$name$";
	
	@Test
	public void testLoadAppStore() throws Exception {
		webDriver.get(ROOT_URL);
		webDriver.switchTo().frame("content-frame");
		String dbId = getDbIdForModule("Inventory");
		WebElement we = waitElement(By.id(dbId));
		assertTrue(we.getText().startsWith("Inventory"));
	}

}
