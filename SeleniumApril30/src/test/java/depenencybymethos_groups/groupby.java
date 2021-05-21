package depenencybymethos_groups;

import org.testng.annotations.Test;

public class groupby {
	
	@Test(dependsOnGroups = {"sanity1"})
	public void abc() {
		System.out.println("I am in test 1");
	}
	@Test(groups = {"sanity1"})
	public void bac() {
		System.out.println("I am in test 2");
	}
	@Test
	public void cab() {
		System.out.println("I am in test 3");
	}
	@Test
	public void dcab() {
		System.out.println("I am in test 4");
	}
}
