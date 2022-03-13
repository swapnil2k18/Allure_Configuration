package project;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Testng2 {

	@Test(priority = 0,description="Test Case 1")
	public void tc_1()
	{
		System.out.println("111111111111111111111");
		
	
	}
	@Test(priority = 1)
	public void tc_2()
	{
		System.out.println("222222222222222222222");
	
	}
	@Test
	public void tc_3()
	{
		System.out.println("333333333333333333333");
	
	}
}
