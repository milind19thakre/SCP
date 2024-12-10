package testbase;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static WebDriver driver;
		
		
		@BeforeMethod
		public static void initialization() {
			
			String br = "chrome";
			
			if(br.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
				
			}
			else if(br.equalsIgnoreCase("firefox")){
				
				WebDriverManager.firefoxdriver().setup();
				driver =  new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("edge")){
				
				WebDriverManager.firefoxdriver().setup();
				driver =  new EdgeDriver();
			}
			else {
				WebDriverManager.chromedriver().setup();
				driver =  new ChromeDriver();
				
			}
			
			
			driver.manage().window().maximize();
			driver.get("https://qa.brinv.com/mvt_scp/login.aspx");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		
		
		@AfterMethod
		public static void quitDriver() {
			driver.quit();
		}


}
