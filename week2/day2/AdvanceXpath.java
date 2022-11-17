package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceXpath {

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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager"); //Attribute based xPath 
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa"); //Partial attribute based xPath
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']")); //Text based xPath
		leads.click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click(); //Partial text based xPath
		driver.findElement(By.xpath("//input[@name='companyName']/parent::td")).sendKeys("Inautix");		

	}

}
