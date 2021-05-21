package config;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesdemo {

	public static void main(String[] args)  {
		getproperty();
		setproperty();
	}

	public static void getproperty()  {

		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");

		//System.out.println(projectPath + "\\src\\main\\resources\\config1.properties");
		try {
			InputStream input1 = new FileInputStream(projectPath + "\\src\\main\\resources\\config.properties");
			prop.load(input1);

			String browser = prop.getProperty("browser");
			System.out.println("the browser from properties file is:   "+ browser);
			
			//GoogleSearchTest_TestNG1.browsername = browser;
		}

		catch(IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static void setproperty()  {

		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");

		//System.out.println(projectPath + "\\src\\main\\resources\\config1.properties");
		try {
			OutputStream output1 = new FileOutputStream(projectPath + "\\src\\main\\resources\\config.properties");
			prop.setProperty("name", "meena");
			prop.store(output1, null);
			

			String browser = prop.getProperty("name");
			System.out.println("the name from properties file is:   "+ prop.getProperty("name"));

		}

		catch(IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}