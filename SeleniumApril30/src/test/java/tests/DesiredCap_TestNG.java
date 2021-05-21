package tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class DesiredCap_TestNG {

	WebDriver ie_driver;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforeTest() {


		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

		WebDriverManager.iedriver().setup();
		ie_driver = new InternetExplorerDriver(caps);
	}


	@Test
	public void googlesearch_desiredcaps() {
		ie_driver.get("https://google.com");	
		ie_driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//chrome_driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		ie_driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[@name='btnK']")).sendKeys(Keys.RETURN);


	}

	@AfterTest
	public void afterTest() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ie_driver.close();


	}

}
