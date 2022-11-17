package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebooTask {

	public static void main(String[] args) {
		// set up browser driver
		WebDriverManager.chromedriver().setup();
								
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
								
		//Load the url
		driver.get("https://en-gb.facebook.com/");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("//div[@linktext ='Forgotten password?'/following::Younger Cousin div")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kathiravan");
		driver.findElement(By.name("lastname")).sendKeys("Elangovan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("01234567890");
		//driver.findElement(By.xpath("//div[@classname = 'placeholder']/following-sibling::input]")).sendKeys("Test@123");
		driver.findElement(By.id("password_step_input")).sendKeys("Test");
		
		//drop down		
		WebElement daydrop = driver.findElement(By.id("day"));
		Select dd = new Select (daydrop);
		dd.selectByValue("18");
		WebElement mondrop = driver.findElement(By.id("month"));
		Select mm = new Select (mondrop);
		mm.selectByIndex(6);
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select yy = new Select (yeardrop);
		yy.selectByVisibleText("1985");
		
		//Radio button
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
