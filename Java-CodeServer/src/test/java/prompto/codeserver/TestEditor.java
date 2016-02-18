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
		WebElement we = waitObjectLink("method_printHelloMail");
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
		WebElement we = waitObjectLink("method_printHelloMail");
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
		we = waitObjectLink("attribute_dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created attribute link
		we = waitObjectLink("attribute_dummy");
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
		we = waitObjectLink("attribute_dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		// ensure the newly created attribute was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("attribute_dummy")).size());
	}

	@Test
	public void testNewCategory() throws Exception {  
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define Dummy as category with attribute name";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("category_Dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created category link
		we = waitObjectLink("category_Dummy");
		we.click();
		assertEquals(code, getEditorContent());
	}
	
	@Test
	public void testDeleteCategory() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define Dummy as category with attribute name";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		// press the newly created category link
		we = waitObjectLink("category_Dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		// ensure the newly created category was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("category_Dummy")).size());
	}

	@Test
	public void testNewTest() throws Exception {  
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define \"dummy test\" as test method doing:\n"
				+ "    a = \"Hello\"\n"
				+ "\band verifying:\n"
				+ "    a = \"Hello\"";
		we.sendKeys(code);
		assertEquals(code.replace("\b",""), getEditorContent());
		we = waitObjectLink("test_dummy_test");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created category link
		we = waitObjectLink("test_dummy_test");
		we.click();
		assertEquals(code.replace("\b",""), getEditorContent());
	}

	@Test
	public void testDeleteTest() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define \"dummy test\" as test method doing:\n"
				+ "    a = \"Hello\"\n"
				+ "\band verifying:\n"
				+ "    a = \"Hello\"";
		we.sendKeys(code);
		assertEquals(code.replace("\b",""), getEditorContent());
		// press the newly created test link
		we = waitObjectLink("test_dummy_test");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		// ensure the newly created test was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("test_dummy_test")).size());
	}

	@Test
	public void testNewMethod1Proto() throws Exception {  
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("method_dummyMethod");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created method link
		we = waitObjectLink("method_dummyMethod");
		we.click();
		assertEquals(code, getEditorContent());
	}

	@Test
	public void testNewMethod2Protos() throws Exception {  
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code1 = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code1);
		assertEquals(code1, getEditorContent());
		we = waitObjectLink("method_dummyMethod");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a method with same name but different proto
		we = getEditorInput();
		String code2 = "define dummyMethod as method receiving description doing:\n"
					+ "    print with \"description=\" + description as value";
		we.sendKeys(code2);
		assertEquals(code2, getEditorContent());
		Thread.sleep(1000); // need to wait for the new "method_dummyMethod" WebElement
		we = waitProtoLink("method_dummyMethod", "proto_description");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the newly created method link
		we = waitProtoLink("method_dummyMethod", "proto_name");
		we.click();
		assertEquals(code1, getEditorContent());
		// press the newly created method link
		we = waitProtoLink("method_dummyMethod", "proto_description");
		we.click();
		assertEquals(code2, getEditorContent());
	}

	@Test
	public void testDeleteMethod1Proto() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		// press the newly created method link
		we = waitObjectLink("method_dummyMethod");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		// ensure the newly created method was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("method_dummyMethod")).size());
	}

	@Test
	public void testDeleteMethod2Protos() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		String code = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		// press the newly created method link
		we = waitObjectLink("method_dummyMethod");
		we.click();
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a method with same name but different proto
		we = getEditorInput();
		String code2 = "define dummyMethod as method receiving description doing:\n"
					+ "    print with \"description=\" + description as value";
		we.sendKeys(code2);
		assertEquals(code2, getEditorContent());
		Thread.sleep(1000); // need to wait for the new "method_dummyMethod" WebElement
		we = waitProtoLink("method_dummyMethod", "proto_description");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		assertEquals("", getEditorContent());
		Thread.sleep(1000); // need to wait for the new "method_dummyMethod" WebElement
		// ensure the newly created method was deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("proto_description")).size());
		// ensure the previous method still exists
		we = waitObjectLink("method_dummyMethod");
	}
	
	@Test
	public void testRevertButton() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create an attribute
		String code = "define dummy as Text attribute";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("attribute_dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a category
		we = getEditorInput();
		code = "define Dummy as category with attribute name";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("category_Dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a method
		we = getEditorInput();
		code = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("method_dummyMethod");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a test
		we = getEditorInput();
		code = "define \"dummy test\" as test method doing:\n"
				+ "    a = \"Hello\"\n"
				+ "\band verifying:\n"
				+ "    a = \"Hello\"";
		we.sendKeys(code);
		assertEquals(code.replace("\b",""), getEditorContent());
		we = waitObjectLink("test_dummy_test");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the revert button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnRevert"));
		we.click();
		assertEquals("", getEditorContent());
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("attribute_dummy")).size());
		assertEquals(0, webDriver.findElements(By.id("category_Dummy")).size());
		assertEquals(0, webDriver.findElements(By.id("method_dummyMethod")).size());
		assertEquals(0, webDriver.findElements(By.id("test_dummy_test")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}
	
	@Test
	public void testCommitAttribute() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create an attribute
		String code = "define dummy as Text attribute";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("attribute_dummy");
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects still exist, and delete them
		webDriver.switchTo().defaultContent();
		we = waitObjectLink("attribute_dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("attribute_dummy")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}
	
	@Test
	public void testCommitCategory() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create a category
		String code = "define Dummy as category with attribute name";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("category_Dummy");
		we.sendKeys(code);
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects still exist, and delete them
		webDriver.switchTo().defaultContent();
		we = waitObjectLink("category_Dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("category_Dummy")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}
	
	@Test
	public void testCommitTest() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create a test
		String code = "define \"dummy test\" as test method doing:\n"
				+ "    a = \"Hello\"\n"
				+ "\band verifying:\n"
				+ "    a = \"Hello\"";
		we.sendKeys(code);
		assertEquals(code.replace("\b",""), getEditorContent());
		we = waitObjectLink("test_dummy_test");
		we.sendKeys(code);
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects still exist, and delete them
		webDriver.switchTo().defaultContent();
		we = waitObjectLink("test_dummy_test");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("test_dummy_test")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}
	
	@Test
	public void testCommitMethod() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create a method
		String code = "define dummyMethod as method receiving name doing:\n"
				+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("method_dummyMethod");
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects still exist, and delete them
		webDriver.switchTo().defaultContent();
		we = waitObjectLink("method_dummyMethod");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("method_dummyMethod")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}
	
	
	@Test
	public void testCommitMany() throws Exception { 
		loadMailAppAndHideCore();
		WebElement we = getEditorInput();
		// create an attribute
		String code = "define dummy as Text attribute";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("attribute_dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a category
		we = getEditorInput();
		code = "define Dummy as category with attribute name";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("category_Dummy");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a method
		we = getEditorInput();
		code = "define dummyMethod as method receiving name doing:\n"
					+ "    print with \"name=\" + name as value";
		we.sendKeys(code);
		assertEquals(code, getEditorContent());
		we = waitObjectLink("method_dummyMethod");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// create a test
		we = getEditorInput();
		code = "define \"dummy test\" as test method doing:\n"
				+ "    a = \"Hello\"\n"
				+ "\band verifying:\n"
				+ "    a = \"Hello\"";
		we.sendKeys(code);
		assertEquals(code.replace("\b",""), getEditorContent());
		we = waitObjectLink("test_dummy_test");
		// press the New button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnNew"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		assertEquals("", getEditorContent());
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the newly created objects still exist, and delete them
		webDriver.switchTo().defaultContent();
		we = waitObjectLink("attribute_dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// next element
		we = waitObjectLink("category_Dummy");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// next element
		we = waitObjectLink("method_dummyMethod");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// next element
		we = waitObjectLink("test_dummy_test");
		we.click();
		// press the Delete button to clear the editor
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnDelete"));
		we.click();
		// press the commit button
		webDriver.switchTo().defaultContent();
		we = waitElement(By.id("btnCommit"));
		we.click();
		Thread.sleep(1000); // need to wait for the commit to be effective
		we = waitElement(By.id("btnRevert"));
		we.click();
		assertEquals("", getEditorContent());
		Thread.sleep(1000); // need to wait for the new WebElements
		// ensure the objects were deleted
		webDriver.switchTo().defaultContent();
		assertEquals(0, webDriver.findElements(By.id("attribute_dummy")).size());
		assertEquals(0, webDriver.findElements(By.id("category_Dummy")).size());
		assertEquals(0, webDriver.findElements(By.id("method_dummyMethod")).size());
		assertEquals(0, webDriver.findElements(By.id("test_dummy_test")).size());
		// ensure the main method still exists
		waitElement(By.id("method_printHelloMail"));
	}

	private WebElement getEditorInput() throws Exception {
		webDriver.switchTo().defaultContent();
		webDriver.switchTo().frame("editor");
		WebElement we = waitElement(By.tagName("textarea"));
		Thread.sleep(100);
		return we;
	}
	
	private WebElement waitObjectLink(String id) throws Exception {
		webDriver.switchTo().defaultContent();
		WebElement we = waitElement(By.id(id));
		we = we.findElement(By.tagName("a"));
		Thread.sleep(100);
		return we;
	}

	private WebElement waitProtoLink(String method, String proto) throws Exception {
		webDriver.switchTo().defaultContent();
		WebElement we = waitElement(By.id(method));
		we = waitElement(we, By.id(proto));
		we = we.findElement(By.tagName("a"));
		Thread.sleep(100);
		return we;
	}


	private String getEditorContent() {
		webDriver.switchTo().defaultContent();
		webDriver.switchTo().frame("editor");
		WebElement we = waitElement(By.className("ace_content"));
		return we.getText();
	}

}
