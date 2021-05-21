package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListener.class)
public class Listenerclass1 {
	
	@Test
	public static void test1() {
		System.out.println("I am inside Test 11");
	}
	
	@Test
	public static void test2() {
		System.out.println("I am inside Test 12");
	}
	

}
