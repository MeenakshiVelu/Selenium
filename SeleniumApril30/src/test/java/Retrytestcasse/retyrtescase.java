package Retrytestcasse;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class retyrtescase {
	
	@Test
	public void test1() {
		System.out.println("This is Test1 of retry package");
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(retryAnalyzer = MyRetry.class)
	
	public void test2() {
		System.out.println("This is Test 2 of retry package");
		Assert.assertTrue(false);
		//Assert.fail();
		
	}
	
	@Test
	public void test3() {
		System.out.println("This is Test 3 of retry package");
		
	}

}
