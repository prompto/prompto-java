package prompto.codeserver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import prompto.expression.EqualsExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.selenium.HtmlUnitWebDriverFactory;
import prompto.selenium.WebDriverFactory;
import prompto.server.AppServer;
import prompto.store.IDataStore;
import prompto.store.IPredicateExpression;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.type.CategoryType;

@SuppressWarnings("unused")
public abstract class BaseWebTest {

	protected static WebDriver webDriver;
	protected static Properties properties;
	
	@BeforeClass
	public static void readProperties() throws IOException {
		try(InputStream input = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("selenium.properties")) {
			properties = new Properties();
			properties.load(input);
		}
	}
	
	@BeforeClass
	@SuppressWarnings("unchecked")
	public static void loadWebDriver() throws Exception {
		String className = properties.getProperty("web-driver-factory", HtmlUnitWebDriverFactory.class.getName());
		Class<? extends WebDriverFactory> klass = (Class<? extends WebDriverFactory>)Class.forName(className);
		webDriver = klass.newInstance().newDriver(properties);
		webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		webDriver.manage().window().setSize(new Dimension(1300, 900));
	}
	
	@AfterClass
	public static void closeWebDriver() {
		if(webDriver!=null) {
			webDriver.quit();
			webDriver = null;
		}
	}
	
	protected void click(WebElement we, int waitMillis) throws InterruptedException {
		// Actions actions = new Actions(webDriver);
		// actions.moveToElement(we).perform();
		we.click();
		Thread.sleep(waitMillis);
	}

	protected void sendKeys(WebElement we, String keysToSend, int waitMillis) throws InterruptedException {
		// Actions actions = new Actions(webDriver);
		// actions.moveToElement(we).perform();
		we.sendKeys(keysToSend);
		Thread.sleep(waitMillis);
	}
	
	protected WebElement waitElement(By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000);
		return wait.until( new ExpectedCondition<WebElement>() {

			@Override public WebElement apply(WebDriver input) {
				return webDriver.findElement(by);
			}
		});
	}

	protected WebElement waitElement(WebElement start, By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, 1000);
		return wait.until( new ExpectedCondition<WebElement>() {

			@Override public WebElement apply(WebDriver input) {
				return start.findElement(by);
			}
		});
	}

	protected String getDbIdForModule(String name) throws Exception {
		IStore store = IDataStore.getInstance();
		store.flush();
		IPredicateExpression filter = new EqualsExpression(
				new UnresolvedIdentifier(new Identifier("name")), 
				EqOp.EQUALS, 
				new TextLiteral( "'" + name + "'"));
		IStored stored = store.interpretFetchOne(AppServer.getGlobalContext(), 
				new CategoryType(new Identifier("Module")), filter);
		return stored.getDbId().toString();
	}

	
}
