package pagelayer;

import org.openqa.selenium.By;

import testbase.BaseClass;

public class ScpLoginPage extends BaseClass {
		
	By userName = By.xpath("//input[@id='m_txtLogin']");
    By Password = By.xpath("//input[@id='m_txtPassword']");
    By loginButton = By.xpath("//input[@id='m_wibLogin_input']");

    
	
		
	public void setUserName(String username) {
		driver.findElement(userName).sendKeys(username);
		
	}
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void login(String username, String password) {
		this.setUserName(username);
		this.setPassword(password);
		this.clickOnLoginButton();		
	}
	
	
	

}
