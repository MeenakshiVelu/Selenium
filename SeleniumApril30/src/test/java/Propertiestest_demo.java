

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class Propertiestest_demo {

	public static void main(String[] args)  {
		getproperty();
	}

	public static void getproperty()  {

		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");

		//System.out.println(projectPath + "\\src\\main\\resources\\config1.properties");
		try {
			InputStream input1 = new FileInputStream(projectPath + "\\src\\test\\resources\\config.properties");
			prop.load(input1);

			String browser = prop.getProperty("browser");
			System.out.println("the browser from properties file is:   "+ browser);

		}

		catch(IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}