package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest_TestNG2 {
	WebDriver chrome_driver;
	
	@BeforeTest
	public void testsetup() {
		WebDriverManager.chromedriver().setup();
		 chrome_driver = new ChromeDriver();
		
	}
	
	@Test
	public void GoogleSearchtestpage_two() {
		
		chrome_driver.get("https://google.com");
		
		
		chrome_driver.findElement(By.name("q")).sendKeys("Sivanathan Meenakshi Velu");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//chrome_driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		chrome_driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
					
	}
	
	@Test
	public void GoogleSearchtestpage_four() {
		
		chrome_driver.get("https://google.com");
		
		
		chrome_driver.findElement(By.name("q")).sendKeys("Sivanathan Meenakshi Velu");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//chrome_driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		chrome_driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
					
	}
	
	@AfterTest
	public void TeardownTests() {
		chrome_driver.close();
		System.out.println("Browser closed successfully");
		
	}
	

}
