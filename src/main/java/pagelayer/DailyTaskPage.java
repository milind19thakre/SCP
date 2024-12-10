package pagelayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testbase.BaseClass;

public class DailyTaskPage extends BaseClass{
	
    By movetoDailyTask = By.xpath("//a[normalize-space()='Daily Tasks']");
    By clickonitems = By.xpath("//li[@id='ctl00_m_lnkItemList']");
    By clickonOrders = By.xpath("//li[@id='ctl00_m_OrderList']");
    By clickonOrderCycleOptimization = By.xpath("//li[@id='ctl00_m_lnkOrderCycleOptimization']");
    By clickonSuppliers = By.xpath("//li[@id='ctl00_m_lnkSourceList']");
    By clickonSupplierGroups = By.xpath("//li[@id='ctl00_m_lnkSourceGroupManager']");
    WebElement mouhover= driver.findElement(By.xpath("//a[normalize-space()='Daily Tasks']"));

    public void movetoDailyTask() {
    	
    	driver.findElement(movetoDailyTask).click(); 
    }
    
    public void clickonitemspage(){   
        driver.findElement(clickonitems).click();
        }

    public void clickonorderspage() {
    	moveToElements();
        driver.findElement(clickonOrders).click();
    }
    
    public void clickonOrderCycleOptimizationpage() {
    	movetoDailyTask();
        driver.findElement(clickonOrderCycleOptimization).click();
    }
    
    public void clickonsupplierpage() {
    	movetoDailyTask();
        driver.findElement(clickonSuppliers).click();
    }
    
    public void clickonsupliergroupspage() {
    	movetoDailyTask();
        driver.findElement(clickonSupplierGroups).click();
    } 
 }