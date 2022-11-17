package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'282')]")).sendKeys("kathir.e3@gmail.com");
		driver.findElement(By.xpath("//button[contains(@id,'334')]")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//a[contains(text(),'Kathir')])[2]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(text(),'11039')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();
		String title = driver.getTitle();
		Thread.sleep(5000);
		if (title.equals("Duplicate Lead | opentaps CRM"))
		{
			driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='submitButton']")).click();
			if (text.equals(driver.findElement(By.xpath("//div[@class='fieldgroup-body']//span[@id='viewLead_firstName_sp']")).getText()))
			{
				System.out.println("Lead \"" +text+"\" is Duplicated Successfully");
				driver.close();
			}
		}
		
		else
		{
			System.out.println("Lead Not duplicated");
		}
		//Thread.sleep(5000);
	}

}
