package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//Click on accounts (Javascript click)
		//driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		driver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Accounts']")));

		//Click on New
		driver.findElement(By.xpath("//div[@title = 'New']")).click();
		
		//Enter your name
		driver.findElement(By.xpath("//input[@name = 'Name']")).sendKeys("Kathiravan");
		String accName = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		//driver.findElement(By.xpath("(//span[text() = '--None--'])[4]")).click();
		//driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']")).click();
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		
		//save and validate
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String check = driver.findElement(By.xpath("//span[text()='Account']/a")).getAttribute("title");
		System.out.println("\nCheck Value: "+check);
		
		
	}

}
