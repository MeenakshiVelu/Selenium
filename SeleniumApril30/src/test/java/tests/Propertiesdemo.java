package tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesdemo {

	public static void main(String[] args)  {
		getproperty();
		//setproperty();
		//getproperty();
	}

	public static void getproperty()  {

		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		InputStream input;

		try {
			//input = new FileInputStream(projectPath + "\\src\\test\\resources\\config.properties");
			input = new FileInputStream(projectPath + "/src/test/resources/config.properties");
			prop.load(input);

			String browser = prop.getProperty("browser");
			System.out.println("the browser from properties file is:   "+ browser);
			GoogleSearchTest_TestNG1.browsername = browser;
			input.close();


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
		OutputStream output;

		//System.out.println(projectPath + "\\src\\main\\resources\\config1.properties");
		try {
			output = new FileOutputStream(projectPath + "/src/test/resources/config.properties");
			prop.setProperty("browser", "chrome");
			prop.setProperty("name", "meena");

			prop.store(output, "Storing a name key");

			String name = prop.getProperty("name");
			System.out.println("the name from properties file is:   "+ name);
			output.close();
		}

		catch(IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}