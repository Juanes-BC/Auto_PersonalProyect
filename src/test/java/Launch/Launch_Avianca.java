package Launch;

import Controller.Controller_Avianca;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Launch_Avianca {
	
	Controller_Avianca controller = new Controller_Avianca();

	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() throws FileNotFoundException {
	  if (driver == null) {
		  controller.aperturaChromeWeb();
	}
  }
  
  @Test
  public void buscarVuelos() {
	  controller.InteractuarMenu();
  }

  @AfterClass
  public void afterClass() {
	  controller.InteractuarMenu();
  }
}
