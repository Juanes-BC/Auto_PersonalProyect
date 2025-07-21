package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators_Avianca {
	
	@FindBy (xpath = "//ul[@class='main-header_nav-primary_list']")
	public WebElement menuAvianca;
	
	@FindBy (xpath = "//ul[@class=\"main-header_nav-primary_list\"]//*[contains(text(),'Reservar')]")
	public WebElement reservas;
	
	public String xpathMenusAvianca = "//ul[@class='main-header_nav-primary_list']";

}
