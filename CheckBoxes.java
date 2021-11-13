package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		List<WebElement> total = driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));

		int size = total.size();
		System.out.println(size);
		
		//if we need to get pick or two element
		
		total.get(0).click();
		
		
		//if i need to get last element
		
		total.get(size-1).click();
		
		Thread.sleep(3000);
		total.get(size-1).click();
	
	}

}
