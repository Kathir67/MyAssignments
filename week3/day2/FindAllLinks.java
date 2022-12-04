package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//retrun a list of web elements
		List<WebElement> getlink = driver.findElements(By.xpath("//div[@class='card']//a"));
		//iterate it
		for(int i=0;i<getlink.size();i++) {
			WebElement allLinks = getlink.get(i);
			String text = allLinks.getText();
			System.out.println(text);
		}

	}

}
