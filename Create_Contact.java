package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Contact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http:leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Stalin");
		driver.findElement(By.id("lastNameField")).sendKeys("Krishna");
		driver.findElement(By.name("firstNameLocal")).sendKeys("bruyne");
		driver.findElement(By.name("lastNameLocal")).sendKeys("muller");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.name("description")).sendKeys("I'm Good");
		
		driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("123@gmail.com");
		WebElement country = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select sel = new Select(country);
		
		sel.selectByValue("PR");
				
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	
	
	
	}

}
