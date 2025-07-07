package Controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Validations.InfPageAvianca;
import Validations.LectorProperties;

public class Controller_Avianca {

	InfPageAvianca info;
	WebDriver driver;
		
	public void aperturaChromeWeb() {
		System.setProperty("webdriver.chrome.driver", LectorProperties.get("driver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LectorProperties.get("url"));
	}
}
