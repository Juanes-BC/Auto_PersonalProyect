package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.PageFactory;

public class Page_Avianca  {
	
	WebDriver driver;

	public void inicializarLocators (WebDriver driver) {
	
		
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this);
	}
	
	
	
}
