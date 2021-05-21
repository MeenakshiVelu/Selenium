package ignore_test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class ignore_method {
	
	@Test
	
	public void test1() {
		System.out.println("inside Test 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("inside Test 2");
	}
	
	
	@Test
	public void test3() {
		System.out.println("inside Test 3");
	}

}
