package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.observer.ExtentObserver;
//import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest_TestNG_EXtentReports {
	WebDriver chrome_driver;
	ExtentReports extent;
	ExtentSparkReporter spark ;

	@BeforeSuite
	public void setuptest_suite() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);

	}

	@BeforeTest
	public void testsetup() {
		WebDriverManager.chromedriver().setup();
		chrome_driver = new ChromeDriver();

	}

	@Test
	public void GoogleSearchtestpage_extentreports_one() {


		chrome_driver.get("https://google.com");	
		extent.createTest("Opening google.com")
		.log(Status.PASS, "This is a logging event1 for MyFirstTest, and it passed!");


		chrome_driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//chrome_driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		chrome_driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//center//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		extent.createTest("display search results")
		.log(Status.PASS, "This is a logging event2 for MyFirstTest, and it passed!");

	}


	@AfterTest
	public void TeardownTests() {
		chrome_driver.close();
		
		extent.createTest("close browser")
		.log(Status.FAIL, "This is a logging event3 for MyFirstTest, and it passed!");
		extent.flush();

	}


}
