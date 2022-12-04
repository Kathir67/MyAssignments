package week3.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(5000);
		
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(5000);
		
		//4. Under "Category" click "Fashion Bags"
		//driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
		
		//5. Print the count of the items Found
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of fashion bags :"+text);
		
		//6. Get the list of brand of the products displayed in the page and print the list
		List<WebElement> findBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> uniqueBrand = new HashSet<String>();
		List<String> brandList = new ArrayList<String>();
		for(int i=0;i<=findBrands.size() ;i++) {
			String brandText = findBrands.get(i).getText();
			boolean add = uniqueBrand.add(brandText);
			if(add){
				uniqueBrand.add(brandText);
			}
		}
		System.out.println(uniqueBrand);
		
		//7. Get the list of names of the bags and print it
		List<WebElement> bagsList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		Set<String> uniqueBag = new HashSet<String>();
		for(int j=0; j<=bagsList.size(); j++) {
			String text2 = bagsList.get(j).getText();
			boolean add = uniqueBag.add(text2);
			if(add) {
				uniqueBag.add(text2);
			}
		}
		System.out.println(uniqueBag);
		
	}

}
