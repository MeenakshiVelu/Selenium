package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GooglePageObjects {

	WebDriver driver=null;
	By textbox = By.name("q");
	By search = By.name("btnK");

	public GooglePageObjects(WebDriver driver){
		this.driver = driver;

	}
	public void textbox_enter(String str_text) {
		driver.findElement(textbox).sendKeys(str_text);		

	}

	public void search_enter() {	
		System.out.println("in here");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(search).sendKeys(Keys.RETURN);		

	}


}
