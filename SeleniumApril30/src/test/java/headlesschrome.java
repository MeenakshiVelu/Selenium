import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class headlesschrome {

	public static void main(String[] args) {
	test();

	}
	public static void test() {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SivaNathan\\SeleniumTutorials\\SeleniumApril30\\drivers\\chromedriver.exe"); 
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("headless");
		  WebDriver driver = new  ChromeDriver(options); 
		  driver.get("https://google.com");
		  System.out.println(driver.getTitle());
		  
		  driver.close();
		  driver.quit();
		  System.out.println("completed");
		  
	}

}
