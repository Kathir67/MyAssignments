package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhonePriceList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//type phones and enter
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
		//creating list for prices
		List<WebElement> allMblEles = driver.findElements(By.className("a-price-whole"));
		List<Integer> priceList = new ArrayList<Integer>();
		for (WebElement eachMblEle : allMblEles) { 
			
			System.out.println(eachMblEle.getText());
			String text = eachMblEle.getText().replace(",", "").replace("₹", "");
			int price = Integer.parseInt(text);
			priceList.add(price);
		}
		
		Collections.sort(priceList);
		System.out.println("Least price: " + priceList.get(0));
		
		/*for(int i=0;i<findElements.size();i++) {
			WebElement webElement1 = findElements.get(i);
			String text = webElement1.getText().replace(",", "");
			int price = Integer.parseInt(text);
			findElements.add(webElement1);
		}
		
		//Collections.sort(price);
		//System.out.println(price);
		System.out.println(findElements);*/
		
		
		
	}

}
