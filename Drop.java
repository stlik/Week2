package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdowns = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropdowns);
		
		select.selectByVisibleText("Loadrunner");
		
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		
		Select select2 = new Select(dropdown2);
		
		select2.selectByVisibleText("Selenium");
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		
		Select select3 =new Select(dropdown3);
		
		select3.selectByValue("2");
		

	}

}
