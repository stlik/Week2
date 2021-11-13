package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_lead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		
		Thread.sleep(3000);
		String title = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a)[1]")).getText();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a)[1]")).click();
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		if (title1.equals("View Lead | opentaps CRM")) {
			System.out.println("Verified");
			}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
		
		if (text.equals("Amazon (10952)")) {
			System.out.println("True");
			
		}
		else {
			System.out.println("Not_Matched");
		}
		
	
		

	}

}
