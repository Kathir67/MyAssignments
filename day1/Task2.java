package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//to handle popup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//to launch web
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//switch to first frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Not a friendly topic");
		//switch to second frame
		driver.switchTo().frame("frame3");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
		checkBox.click();
		if(checkBox.isSelected()) {
			System.out.println("Clicked CheckBox");
		}else {
			System.out.println("Not Clicked Check Box");
		}
		driver.switchTo().defaultContent();
		//switch to thrid frame
		driver.switchTo().frame("frame2");
		Select dd = new Select (driver.findElement(By.xpath("//select[@class='col-lg-3']")));
		dd.selectByIndex(1);
	}

}
