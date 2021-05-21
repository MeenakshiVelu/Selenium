package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwait {
	public static void main(String[] args) {
		test();

	}


	public static void test() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).sendKeys("ABCD");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 WebElement element = driver.findElement(By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[6]/span[1]/table/tbody/tr/td[3]/a"));
			 		
			 		return element;
			    	 //return driver.findElement(By.id("foo"));
			     }
			   });
			   element.click();

		
		
		 Wait<WebDriver>  wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element1 = wait1.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    	 WebElement element2 = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[9]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]"));
			 		
			 		return element2;
			    	 //return driver.findElement(By.id("foo"));
			     }
			   });
			   element1.click();
	
				
	//	element1.click();
		System.out.println(element1);

	}
}
