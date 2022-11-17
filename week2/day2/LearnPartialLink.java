package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPartialLink {

	public static void main(String[] args) {
		// set up browser driver
				WebDriverManager.chromedriver().setup();
								
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
								
				//Load the url
				driver.get("http://leaftaps.com/opentaps/control/login");
						
				//maximize the browser window
				driver.manage().window().maximize();
						
				//find the elements
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
	}

}
