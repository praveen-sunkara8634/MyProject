package com.gittest.samplepackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void test()
	{
		System.out.println("first test status");
		Reporter.log("first report status", true);
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am also getting triggered");
	}

}
