package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnAuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
