package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		//to handle popup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//to launch web
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//To take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//To create a new physical file
		File dest = new File("./snaps/irctc.png");
		File dest2 = new File("F:\\TestLeaf\\snaps\\irctc.png");
		//to copy from source
		FileUtils.copyFile(source, dest);
		FileUtils.copyFile(source, dest2);

	}

}
