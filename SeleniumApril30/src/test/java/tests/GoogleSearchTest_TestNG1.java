package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest_TestNG1 {
	WebDriver chrome_driver;
	public static String browsername;
	
	@BeforeTest
	public void testsetup() {
		Propertiesdemo.getproperty();
		if(browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			 chrome_driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			 chrome_driver = new FirefoxDriver();
		}
		
		 
		
	}
	
	@Test
	public void GoogleSearchtestpage_one() {
		
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
