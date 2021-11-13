package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(500);

		driver.findElement(By.linkText("Create New Account")).click();

		Thread.sleep(1000);
		// driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("Stalin");

		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080489510");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Zeno@123");
		WebElement day4 = driver.findElement(By.id("day"));
		
		Select select1 =new Select(day4);

		select1 .selectByVisibleText("4");
		
		WebElement month = driver.findElement(By.id("month"));
		
		new Select(month).selectByVisibleText("Oct");
		
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		new Select(year).selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@value ='1']")).click();
		
		
	}

}
