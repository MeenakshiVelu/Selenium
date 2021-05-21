package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listeners.TestNGListener.class)
public class Listenerclass2 {
	
	@Test
	public static void test3() {
		System.out.println("I am inside Test 13");
	}
	
	@Test
	public static void test4() {
		System.out.println("I am inside Test 14");
		Assert.assertTrue(false);
	}
	

}
