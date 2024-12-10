package pagelayer;

import org.openqa.selenium.By;

import testbase.BaseClass;

public class AdvanceTaskPage extends BaseClass {
	
	By moveToAdvanceTask = By.xpath("//li[@id='ctl00_m_lnkAdvancedTasks']");
	By clickonAdvanceSeasonality	= By.xpath("//li[@id='ctl00_m_lnkAdvancedSeasonality']");
	By clickonCustomGroups = By.xpath("//li[@id='ctl00_m_lnkCustomGroup']");
	By clickonCustomView = By.xpath("//li[@id='ctl00_m_lnkClarityViews']");
	By clickonEventPlanning = By.xpath("//li[@id='ctl00_m_lnkEventList']");
	By clickonEventItems = By.xpath("//li[@id='ctl00_m_ItemEventList']");
	By clickonForwordBuying = By.xpath("//li[@id='ctl00_m_lnkDeals']");
	By clickonKitting = By.xpath("//li[@id='ctl00_m_lnkKitList']");
	By clickonMassMaintenance = By.xpath("//li[@id='ctl00_m_lnkMassMaintenance']");
	By clickonProfiles = By.xpath("//li[@id='ctl00_m_lnkProfileList']");
	By clickonProjections = By.xpath("//li[@id='ctl00_m_lnkProjectionList']");
	
	public void moveToAdvanceTask() 
	{
		driver.findElement(moveToAdvanceTask).click();
	}
	public void clickonAdvanceSeasonality() {
		driver.findElement(clickonAdvanceSeasonality).click();
	}
	public void clickonCustomGroups() 
	{
		driver.findElement(clickonCustomGroups).click();
	}
	public void clickonCustomView() {
		driver.findElement(clickonCustomView).click();
	}
	public void clickonEventPlanning() {
		driver.findElement(clickonEventPlanning).click();
	}
	public void clickonEventItems() 
	{
		driver.findElement(clickonEventItems).click();
	}
	public void clickonForwordBuying() 
	{
		driver.findElement(clickonForwordBuying).click();
	}
	public void clickonKitting() 
	
	{
		driver.findElement(clickonKitting).click();
	}
	public void clickonMassMaintenance() 
	{
		driver.findElement(clickonMassMaintenance).click();
	}
	public void clickonProfiles() 
	{
		driver.findElement(clickonProfiles).click();
	}
	
	public void clickonProjections() 
	{
		driver.findElement(clickonProjections).click();
	}
	
	
	

}
