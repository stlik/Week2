package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		
		System.out.print(driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input")).
				getAttribute("value"));
		
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.id("color")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getSize());
		System.out.println(driver.findElement(By.id("color")).isDisplayed());
		
		
	}

}
