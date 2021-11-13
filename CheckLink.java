package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]"));
		
		Thread.sleep(5000);
		
		element.click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.id("home")).click();
		//element.clear();
		
		//element.sendKeys("stalin");
		
		

	}

}
