package testslayer;

import org.testng.annotations.Test;

import pagelayer.DailyTaskPage;
import pagelayer.ScpLoginPage;

public class DailyTaskPageLoadTest extends pagelayer.DailyTaskPage {
     
        
    @Test
    public void DailyTaskPageLoad() throws InterruptedException  {
    	
    	ScpLoginPage LP = new ScpLoginPage();
    	LP.login("implementation", "Bluer1dge@3");    	
    	Thread.sleep(2000L); 
    	DailyTaskPage DT = new DailyTaskPage();
        DT.clickonitemspage();        
       
    }  
}