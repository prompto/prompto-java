package prompto.selenium;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriverFactory implements WebDriverFactory {

	@Override
	public WebDriver newDriver(Properties props) {
		return new FirefoxDriver();
	}

}
