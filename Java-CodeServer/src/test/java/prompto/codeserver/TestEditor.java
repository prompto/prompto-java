package prompto.codeserver;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import prompto.server.AppServer;

@Category(SeleniumTest.class)
public class TestEditor extends BaseWebTest {

	@BeforeClass
	public static void startCodeServer() throws Throwable {
		String[] args = {
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
	public void testSelectMethod() throws Exception { 
		loadMailAppAndHideCore();
		// ensure no code is loaded in editor
		String content = getEditorContent();
		assertEquals("", content);
		// locate method item
		WebElement we = getObjectLink("method_printHelloMail");
		assertEquals("printHelloMail", we.getText());
		we.click();
		// ensure code was loaded in editor
		content = getEditorContent();
		assertTrue(content.length()>0);
	}

	private void loadMailAppAndHideCore() throws Exception {
		String dbId = getDbIdForModule("Mail");
		String url = EDITOR_URL.replace("$dbId$", dbId).replace("$name$", "Mail");
		webDriver.get(url);
		// hide core declarations
		WebElement we = waitElement(By.id("show-core"));
		if(we.isSelected())
			we.click();
		we = waitElement(By.id("method_printHelloMail"));
	}

	@Test
	public void testNewButton() throws Exception { 
		loadMailAppAndHideCore();
		// locate method item
		WebElement we = getObjectLink("method_printHelloMail");
		assertEquals("printHelloMail", we.getText());
		we.click();
		// ensure code was loaded in editor
		String content = getEditorContent();
		assertTrue(content.length()>0);
		// press the New button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// ensure code is cleared
		content = getEditorContent();
		assertEquals("", content);
	}

	@Test
	public void testNewAttribute() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define dummy as Text attribute";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created attribute link
		we = getObjectLink("attribute_dummy");
		we.click();
		assertEquals(code, getEditorContent());
	}
	
	@Test
	public void testDeleteAttribute() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define dummy as Text attribute";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		// press the newly created attribute link
		we = getObjectLink("attribute_dummy");
		we.click();
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		// ensure the newly created attribute was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("attribute_dummy")).size());
	}

	
	private WebElement getEditorInput() {
		webDriver.switchTo().defaultContent();
		webDriver.switchTo().frame("editor");
		return waitElement(By.tagName("textarea"));
	}

	private WebElement getObjectLink(String id) {
		webDriver.switchTo().defaultContent();
		WebElement we = waitElement(By.id(id));
		return we.findElement(By.tagName("a"));
	}

	private String getEditorContent() {
		webDriver.switchTo().defaultContent();
		webDriver.switchTo().frame("editor");
		WebElement we = waitElement(By.className("ace_content"));
		return we.getText();
	}

}
