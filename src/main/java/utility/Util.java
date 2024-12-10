package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testbase.BaseClass;

public class Util extends BaseClass{
	
	
	
	public void moveToElements() {
		
		WebElement mouhover= driver.findElement(By.xpath("//a[normalize-space()='Daily Tasks']")); 
		
		Actions act = new Actions(driver);
		act.moveToElement(mouhover).build().perform();
		
	}

}
