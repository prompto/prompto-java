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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import prompto.selenium.HtmlUnitWebDriverFactory;
import prompto.selenium.WebDriverFactory;

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
	
	protected WebElement waitElement(By by) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		return wait.until( new ExpectedCondition<WebElement>() {

			@Override public WebElement apply(WebDriver input) {
				return webDriver.findElement(by);
			}
		});
	}

	
}
