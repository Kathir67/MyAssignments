package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// set up browser driver
		WebDriverManager.chromedriver().setup();
										
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
										
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		//maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sachin");
		driver.findElement(By.id("lastNameField")).sendKeys("Tendulkar");
		driver.findElement(By.xpath("//input[contains (@id, 'firstNameLocal')]")).sendKeys("sach");
		driver.findElement(By.xpath("//input[contains (@id, 'lastNameLocal')]")).sendKeys("tend");
		driver.findElement(By.xpath("//input[contains (@name, 'department')]")).sendKeys("cricket");
		driver.findElement(By.xpath("//textarea[contains (@name, 'desc')]")).sendKeys("GOAT");
		driver.findElement(By.xpath("//input[contains (@id, 'primaryEmail')]")).sendKeys("kathir.e3@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[contains(@name,'generalState')]"));
		Select st = new Select (state);
		st.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[contains(@name,'descr')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@name,'important')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		System.out.println("The title is :" + driver.getTitle());
	}

}
