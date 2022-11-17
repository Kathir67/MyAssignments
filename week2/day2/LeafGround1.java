package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround1 {

	public static void main(String[] args) {
		// set up browser driver
		WebDriverManager.chromedriver().setup();
										
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
										
		//Load the url
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
				
		//maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Sachin");
		driver.findElement(By.xpath("(//div[@class ='col-12']/input)[2]")).sendKeys("Country");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Country");
		driver.findElement(By.xpath("//input[(@id='j_idt88:j_idt91'")).isEnabled();
		String attribute = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("kathir.e3@gmail.com",Keys.TAB);
	}

}
