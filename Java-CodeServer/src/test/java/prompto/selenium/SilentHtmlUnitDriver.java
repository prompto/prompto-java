package prompto.selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;

public class SilentHtmlUnitDriver extends HtmlUnitDriver {

	public SilentHtmlUnitDriver() {
		super(true);
		initWebClient();
	}

	@Override
	public WebClient getWebClient() {
		return super.getWebClient();
	}
	
	private void initWebClient() {
		WebClient client = getWebClient();
		client.getOptions().setJavaScriptEnabled(true);
		client.getOptions().setThrowExceptionOnScriptError(false);
		client.getOptions().setCssEnabled(true);
	 	client.setAjaxController(new NicelyResynchronizingAjaxController());
	}
}
