package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selen {

	public static void main(String[] args) {
		// set up browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathiravan1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elangovan1");
		
		//drop down		
		WebElement eledrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select (eledrop);
		dd.selectByValue("LEAD_CONFERENCE");
		
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
		
	}

}
