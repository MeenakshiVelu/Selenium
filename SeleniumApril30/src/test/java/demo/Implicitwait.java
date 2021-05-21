package demo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {

	public static void main(String[] args) {
		implict_wait_ex();

	}

	@SuppressWarnings("unlikely-arg-type")
	public static void implict_wait_ex() {

		String project_path = System.getProperty("user.dir");

		System.setProperty("webdriver.gecko.driver",project_path + "\\drivers\\geckodriver.exe"); 
		WebDriver driver =  new  FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/?ccde=us");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement disp = driver.findElement(By.className("fullpage-error-container"));
		if(disp.equals(true)) {
			System.out.println(" found");
		}
		else {
			
			System.out.println("Not Hurray");
		}







	}
}
