package prompto.selenium;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class HtmlUnitWebDriverFactory implements WebDriverFactory {

	@Override
	public WebDriver newDriver(Properties props) {
		return new SilentHtmlUnitDriver();
	}

}
