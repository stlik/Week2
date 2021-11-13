package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACME {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.findElement(By.xpath("//h1[@class='page-header']")).getText();
		System.out.println(title);
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		
		
		
		
		
		
}
	
}
