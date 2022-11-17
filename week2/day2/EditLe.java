package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
				
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Kathir");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'updateLeadForm_c')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'updateLeadForm_c')]")).sendKeys("Steria");
		driver.findElement(By.xpath("//input[contains(@name,'submitBu')]")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@id,'viewLead_companyName_sp')]")).getText();
		String [] compSplit = attribute.split(" ");
		if (compSplit[0].equals("Steria"))
		 {
			 System.out.println("Company Name is updated");
			 driver.close();
		 }
		 else
		 {
			 System.out.println("Company Name is not updated");
		 }
		}
		
	}


