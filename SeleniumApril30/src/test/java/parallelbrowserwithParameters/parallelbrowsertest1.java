package parallelbrowserwithParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelbrowsertest1 {
	WebDriver driver;

	@BeforeTest
	@Parameters("browserName")
	public void setUp(String browserName) {
		System.out.println("The browser is : "+ browserName);
		System.out.println("The thread count  is : "+ Thread.currentThread().getName());

		if(browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}


	@Test
	public void test1() {
		driver.get("https://google.com");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
