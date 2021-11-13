package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sales_Force {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Stalin");
		driver.findElement(By.name("UserLastName")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123@gmail.com");
		
		WebElement title = driver.findElement(By.name("UserTitle"));
		
		Select select1 =new Select(title);
		
		select1.selectByValue("IT_Manager_AP");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Rings");
		
		WebElement Employee = driver.findElement(By.name("CompanyEmployees"));
		
		new Select(Employee).selectByValue("75");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9080489510");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
