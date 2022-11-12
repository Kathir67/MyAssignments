package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf3");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathir3");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Elango3");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kat3");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE3");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("kathir task for day 3");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kathir.e3@gmail.com");
		//drop down		
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select (province);
		dd.selectByVisibleText("New York");
		//Createlead
		WebElement submit = driver.findElement(By.name("submitButton"));
		submit.click();
		//Get title of the page
		System.out.println("The title is :" + driver.getTitle());
		//DuplicateLead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafDuplicate");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathir duplicate");
		//CreateLead
		WebElement submit2 = driver.findElement(By.name("submitButton"));
		submit2.click();
		//Get title of the page
		System.out.println("The title is :" + driver.getTitle());
		


	}

}
