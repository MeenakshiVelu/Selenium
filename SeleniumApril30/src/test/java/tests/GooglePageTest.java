package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GooglePageObjects;

public class GooglePageTest {

	WebDriver driver;

	public static void main(String[] args) {
		
		GoogleSearch();
	}
	public static void GoogleSearch() {

		WebDriverManager.chromedriver().setup();
		WebDriver chrome_driver = new ChromeDriver();

		GooglePageObjects obj = new GooglePageObjects(chrome_driver);
		
		chrome_driver.get("https://google.com");
		
		obj.textbox_enter("Hello");
		obj.search_enter();



	}

}
