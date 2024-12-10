package pagelayer;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import testbase.BaseClass;

public class HelpPage extends BaseClass {
	
	By clickonHelpmenu = By.xpath("//li[@id ='ctl00_m_lnkHelp']");
    By clickonAbout = By.xpath("//li[@id='ctl00_Li1']");
    By clickonhelp = By.xpath("//li[@id='ctl00_Li2']");
    By clickonClose = By.xpath("//a[text()='Close']");
	
	/*	public void clickonAboutPage() {
		driver.findElement(clickonHelpmenu).click();
		driver.findElement(clickonAbout).click();		
	}
*/
	public void clickonhelpPage() {
		driver.findElement(clickonHelpmenu).click();
		driver.findElement(clickonhelp).click();
		
		Set<String>window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		driver.switchTo().defaultContent();
		}
	

	
	
}
