package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ItemsPage {

	RemoteWebDriver driver;
	
	public ItemsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//locators of elements
		By dailyTask = By.id("m_txtLogin");
		
}
