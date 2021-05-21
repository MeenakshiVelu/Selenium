package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.Propertiesdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	WebDriver chrome_driver ;

	@BeforeTest
	public void testsetup() {

		WebDriverManager.chromedriver().setup();
		chrome_driver = new ChromeDriver();
	}


	@Test(dataProvider = "test1data")
	public void test1(String username , String password) {
		System.out.println(username +" | "+password);
		chrome_driver.get("https://opensource-demo.orangehrmlive.com/");
			//chrome_driver.get("https://google.com");	
		chrome_driver.findElement(By.id("txtUsername")).sendKeys(username);
		chrome_driver.findElement(By.id("txtPassword")).sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	@DataProvider(name ="test1data")	
	public Object[][] getdata() {
		String path = System.getProperty("user.dir")+ "/Excel_files/data1.xlsx" ;
		Object data[][] = testdata(path, "Sheet1");
		return data;

	}

	public Object[][] testdata(String path, String sheetname){
		Exceldata excel = new Exceldata(path, sheetname);
		int rowcount = excel.get_rowCount();
		int colcount = excel.get_colCount();

		Object data[][] = new Object[rowcount-1][colcount];
		for(int i =1;i<rowcount; i++) {
			for(int j=0;j<colcount;j++) {
				data[i-1][j]= excel.get_cellData(i, j);

			}
		}

		return data;


	}


}
