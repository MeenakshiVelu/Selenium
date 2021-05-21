import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yahoomailtest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver chrome_driver = new ChromeDriver();

		chrome_driver.get("https://login.yahoo.com/");
		//1. By id --I
		//		chrome_driver.findElement(By.id("login-username")).sendKeys("Test");
		//		chrome_driver.findElement(By.id("login-signin")).click();

		//2 by name --I
		//		chrome_driver.findElement(By.name("username")).sendKeys("Test");
		//		chrome_driver.findElement(By.name("signin")).click();

		//3.by xpath		--II
		//		chrome_driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Test");
		//		chrome_driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		//		
		//4.by cssselector	--II	
		//		chrome_driver.findElement(By.cssSelector("@login-username")).sendKeys("Test");
		//		chrome_driver.findElement(By.xpath("@login-signin")).click();
		//				
		//		//5.by linktext only for links		 forgot password
		//		chrome_driver.findElement(By.linkText("Forgot username?")).click();

		//6.by linktext only for links		only partial text should be entered forgot password
		//chrome_driver.findElement(By.partialLinkText("username?")).click();


		//7.by classname
		chrome_driver.findElement(By.className("phone-no")).sendKeys("Test");
		chrome_driver.findElement(By.id("login-signin")).click();



	}

}
