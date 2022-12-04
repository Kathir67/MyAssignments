package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4LeafGround {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//confirm new window opens
		driver.findElement(By.id("j_idt88:new")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		
		// Click and Confirm new Window Opens
		System.out.println("\nTitle of new Window: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(windowList.get(0));
		
		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windowList1.get(1));
		if(windowList1.size()>1) {
			System.out.println("Multiple windows opened");
		}
		driver.close();
		driver.switchTo().window(windowList.get(0));
		
		//3rd option
		driver.findElement(By.xpath("//span[contains(text(),'Open with delay')]")).click();
		Thread.sleep(5000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowList2 = new ArrayList<String>(windowHandles2);
		System.out.println("Number of pages opened "+windowList2.size());
		driver.switchTo().window(windowList2.get(3));
		driver.close();
		driver.switchTo().window(windowList2.get(2));
		driver.close();
		driver.switchTo().window(windowList2.get(1));
		driver.close();
		driver.switchTo().window(windowList.get(0));
		System.out.println(driver.getTitle());

	}

}
