package Parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_howtouse {
	
	@Test
	@Parameters({"Myname"})
	//public void test1(String name) {
		public void test1(@Optional("defaultvalueyoucangivehere") String name) {
		System.out.println("The name passed is :"+ name);
		
	}

}
