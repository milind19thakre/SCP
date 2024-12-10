package testslayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pagelayer.HelpPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HelpPageLoadTest extends pagelayer.HelpPage {	

	
	@Test
	public void HelpPageLoad() throws InterruptedException {
		LoginTest LP = new LoginTest();
		HelpPage HP = new HelpPage();

		LP.login("implementation", "Bluer1dge@3");
		Thread.sleep(6000L);
		//hp.clickonAboutPage();
		HP.clickonhelpPage();
	
	}

}
