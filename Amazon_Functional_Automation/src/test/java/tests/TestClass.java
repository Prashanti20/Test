package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;

public class TestClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite-TestClass_1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-TestClass_1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-TestClass_1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method-TestClass_2");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method-TestClass_2");
	}
	
	
	
	
}
