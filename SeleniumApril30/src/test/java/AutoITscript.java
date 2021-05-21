import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITscript {

	public static void main(String[] args)  {

		test();
	}
	public static void test()  {		

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SivaNathan\\SeleniumTutorials\\SeleniumApril30\\drivers\\chromedriver.exe"); 

		//	WebDriver driver = new  ChromeDriver(); 

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.filedropper.com/");
		//driver.get("http://google.com");

		WebElement elem = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/fieldset[1]/p[1]/input[1]"));

		elem.sendKeys(Keys.RETURN);
		
		//driver.findElement(By.name("q")).sendKeys("hello Google");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);


		/*
		 * try { Runtime.getRuntime().exec(
		 * "C:\\Users\\SivaNathan\\Documents\\Tinyupload\\upload.exe"); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */


	}


}
