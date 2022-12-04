package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		//default lines
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//code for simple alerts Switch to, get text and accept
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//code for confirmation alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span")).click();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.dismiss();
		
		//code for prompt alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span")).click();
		String text3 = alert.getText();
		System.out.println(text2);
		alert.sendKeys("TestLeaf");
		Thread.sleep(5000);
		alert.accept();

	}

}
