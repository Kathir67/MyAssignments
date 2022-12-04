package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//2.Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//3.Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4.Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5.Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		System.out.println(driver.getTitle());
		//6.Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//7.Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();

		//8.Click on First Resulting Contact
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
				
		//9.Click on Widget of To Contact
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		//10.Click on Second Resulting Contact
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		//11.Click on Merge button using Xpath Locator
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//12.Accept the Alert
		driver.switchTo().alert().accept();
		
		//13.Verify the title of the page
		System.out.println(driver.getTitle());
		driver.close();		

	}

}
