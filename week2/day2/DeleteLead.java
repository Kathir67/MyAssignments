package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'Area')])[4]")).sendKeys("123");
		//driver.findElement(By.xpath("(//input[contains(@name,'Number')])[4]")).sendKeys("4567");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		//String text = driver.findElement(By.xpath("//div[contains(@id,'926')]")).getText();
		//System.out.println(text);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'12951')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[1]")).click();
		driver.findElement(By.linkText("Find Leads")).click(); 	
		driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("12951");
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		Thread.sleep(5000);
		String msg = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div[@class='x-paging-info']")).getText();
		System.out.println(msg);
		if (msg.equals("No records to display")) {
			System.out.println(" is Deleted successfully");
		}
		else {
			System.out.println(" is NOT Deleted successfully");
		}
	}

}
