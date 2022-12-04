package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first product is " + text);
		
		WebElement num = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		System.out.println("\nTotal number of custmers rated the First Displayed Product: "+num.getText());
		
		//Click the first text link for the first product
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//Take screenshot of the product
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File ("./snaps/productdisplayed.png");
		FileUtils.copyFile(src,dst);
		
		//Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Get the cart subtotal and verify if it is correct.
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.id("attach-accessory-cart-subtotal"));
		String sub = cart.getText();
		//String text2 = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		//System.out.println("Cart Subtotal: " +text2);
		
		//System.out.println("\nCart Subtotal: "+cart.getText());
		//WebElement cart = driver.findElement(By.id("attach-accessory-cart-subtotal"));
		//String text2 = cart.getText();
		//String cartValue = .toString();*/
		System.out.println("Cart value is" + sub);
		if(sub.contains(text)) {
			System.out.println("Price verified");
		}else {
			System.out.println("Price not verified");
		}
		driver.quit();
		
	}

}
