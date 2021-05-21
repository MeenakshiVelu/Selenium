import org.testng.annotations.Test;

public class priority {

	@Test(priority =1)
	public void one() {
		System.out.println("Running Test 1");
	}
	
	@Test
	public void two() {
		System.out.println("Running Test 2");
	}
	
	@Test(priority =0)
	public void three() {
		System.out.println("Running Test 3");
	}
}
