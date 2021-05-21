import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkyes_ex1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver chrome_driver = new ChromeDriver();
		
		chrome_driver.get("https://google.com");
		//WebElement textbox = chrome_driver.findElement(By.name("q"));
		WebElement textbox1 = chrome_driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		textbox1.sendKeys("Sivanathan");
		
		
		WebElement search = chrome_driver.findElement(By.name("btnK"));
		search.sendKeys(Keys.RETURN);
		//search.click();
		
		
				
				
	}

}
