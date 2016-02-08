package prompto.codeserver;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
import prompto.literal.TextLiteral;
import prompto.server.AppServer;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.CategoryType;

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
	public void testLoadAppStore() throws Exception {
		webDriver.get(ROOT_URL);
		webDriver.switchTo().frame("content-frame");
		String dbId = getDbIdForModule("Mail");
		WebElement we = waitElement(By.id(dbId));
		assertTrue(we.getText().startsWith("Mail"));
	}

	@Test
	public void testButtonNew() throws Exception {
		String dbId = getDbIdForModule("Mail");
		String url = EDITOR_URL.replace("$dbId$", dbId).replace("$name$", "Mail");
		webDriver.get(url);
		WebElement we = waitElement(By.id("btnNew"));
		assertEquals("New", we.getText());
		assertTrue(we.isEnabled());
	}

	private String getDbIdForModule(String name) throws Exception {
		IStore store = IDataStore.getInstance();
		IExpression filter = new EqualsExpression(
				new UnresolvedIdentifier(new Identifier("name")), 
				EqOp.EQUALS, 
				new TextLiteral( "'" + name + "'"));
		IStored stored = store.fetchOne(AppServer.getGlobalContext(), 
				new CategoryType(new Identifier("Module")), filter);
		return stored.getDbId().toString();
	}

}
