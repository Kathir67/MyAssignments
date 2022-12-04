package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionsTask1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//enter Phones and enter
		driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		//listing prices
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//creating a lost for price
		List<Integer> price = new ArrayList<Integer>();
		
		for (int i = 0; i < findElements.size(); i++) {
			WebElement element = findElements.get(i);
			System.out.println(element);
			String text = element.getText().replace(",", "");
			int priceValue = Integer.parseInt(text);
			price.add(priceValue);
		}
		Collections.sort(price);
		System.out.println(price);
		
	}

}
