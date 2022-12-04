package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		//4) Click on Global Actions SVG icon
		driver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Global Actions']")));
		
		//Click on new task
		driver.findElement(By.xpath("//span[text()='New Task']")).click();
		
		//enter subject as Bootcamp
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		//String text1 = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input slds-combobox__input-value']")).getText();
		//System.out.println(text1);
		
		Thread.sleep(50);
		driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		
		String text2 = driver.findElement(By.xpath("//span[text()='Task']")).getText();
		System.out.println(text2);
		
		if(text2.contains("Bootcamp")) {
			System.out.println("all good");
		}else {
			System.out.println("something wrong");
		}
	}
	

}
