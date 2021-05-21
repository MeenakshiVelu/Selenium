package TestNGGrouping;

import org.testng.annotations.Test;


@Test(groups= {"AllClassTest"})
public class TestNG_group {

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("This is Test1 ");
	}

	@Test
	public void test2() {
		System.out.println("This is Test2 ");
	}

	@Test(groups = {"smoke", "sanity"})
	public void test3() {
		System.out.println("This is Test3 ");
	}

	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("This is Test4");
	}

	@Test(groups = {"sanity"})
	public void test5() {
		System.out.println("This is Test5");


	}
	
	@Test(groups = {"windows.regression"})
	public void test6() {
		System.out.println("This is Test6 for Windows");


	}
}