package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomActivity1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
		//switch to first frame
		driver.switchTo().frame("iframeResult");
		//switch to second frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//driver.switchTo().frame(ele);
		//Click using alert
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		//send input using prompt alert
		alert2.sendKeys("Kathir");
		alert2.accept();
		//compare both text
		String text = driver.findElement(By.id("demo")).getText();
		if(text.contains("Kathir")) {
			System.out.println("Validated");
		}else {
			System.out.println("Not validated");
		}
	}

}
