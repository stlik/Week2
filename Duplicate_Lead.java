package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate_Lead {

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

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("testleaf.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		
		

		String Name = driver.findElement(By.xpath("//span[text()='Email']")).getText();

		System.out.println(Name);
		
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//child::a")).getText();
		System.out.println(text);
		
		

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//child::a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String Title = driver.getTitle();

		System.out.println(Title);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}
}