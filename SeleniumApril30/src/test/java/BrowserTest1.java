import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest1 {

	public static void main(String[] args) {


		String project_path = System.getProperty("user.dir");

		//firefox driver

		
		  System.setProperty("webdriver.gecko.driver",project_path + "\\drivers\\geckodriver.exe"); 
		  WebDriver firefox_driver = new  FirefoxDriver(); 
		  firefox_driver.get("https://google.com/");
		  try { Thread.sleep(3000); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		  
		  firefox_driver.close();
		  firefox_driver.quit();
		 

		//Chrome driver
		
		 // System.setProperty("webdriver.chrome.driver",project_path + "\\drivers\\chromedriver.exe");
		  
		  WebDriverManager.chromedriver().setup();
		  // if we needd any specifc chrome bower version
		  WebDriverManager.chromedriver().browserVersion("2.36").setup();
		  
		  WebDriver chrome_driver = new ChromeDriver();
		  chrome_driver.get("https://google.cocm"); 
		  try {
		  Thread.sleep(3000); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		  
		  chrome_driver.close();
		  chrome_driver.quit();
		 

		//IE

		System.setProperty("webdriver.ie.driver",project_path + "\\drivers\\IEDriverServer.exe");

		WebDriver ie_driver = new InternetExplorerDriver();
		ie_driver.get("https://google.com/");




	}

}
