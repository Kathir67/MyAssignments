package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicXpath {

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
		//driver.findElement(By.xpath("(//a[text(),'Create Lead'])[2]")).click(); //Indexbased xPath
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm')][@name='companyName']")).sendKeys("TestLeaf4");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm')][@name='firstName']")).sendKeys("kathir4");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm')][@name='lastName']")).sendKeys("e4");
		//Createlead
		driver.findElement(By.xpath("//input[contains(@name,'submitBu')]")).click();
		
		
	}

}
