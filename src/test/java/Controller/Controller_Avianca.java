package Controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Page_Avianca;
import Validations.Lector_Excel;
import Validations.LectorProperties;

public class Controller_Avianca {

	Lector_Excel info;
	WebDriver driver;
	Page_Avianca page;
	
		
	public void aperturaChromeWeb() {
		System.setProperty("webdriver.chrome.driver", LectorProperties.get("driver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LectorProperties.get("url"));
	}
	
	public void InteractuarMenu () {
		Page_Avianca page = new Page_Avianca();
		page.inicializarLocators(driver);
	}

}
