package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	@Test(priority=1,invocationCount=4,threadPoolSize = 4)
	public void register()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Registered successfully",true);	
	}
	@Test(priority=2,enabled = false )
	public void login()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Logged successfully",true);	
			
	}	
}
