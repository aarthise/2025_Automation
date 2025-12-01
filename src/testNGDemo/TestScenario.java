package testNGDemo;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario {
	
	@Test(priority=1,groups= {"Smoke"})
	public void first_testcase() {
		System.out.println("first_testcase");
	}
	@Test(priority=2)
	public void second_testcase() {
		System.out.println("second_testcase");
		//Assert.assertEquals("Hello","Hello world");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello","Hello world");
		System.out.println("this test case is getting failed");
	}
	@Test
	public void third_testcase() {
		System.out.println("third_testcase");
		assertEquals("Hello","Hello world");
	}
	@Test(priority=0,groups= {"Smoke"})
	public void forth_testcase() {
		System.out.println("forth_testcase");
	}
	@Test(priority=-2,enabled=true,groups= {"Smoke"})
	public void fifth_testcase() {
		System.out.println("fifth_testcase");
	}
	@Test(priority=-1,dependsOnMethods="forth_testcase")
	public void sixth_testcase() {
		System.out.println("sixth_testcase");
	}
	@Test(priority=-3)
	public void seventh_testcase() {
		System.out.println("seventh_testcase");
	}

}
