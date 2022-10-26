package org.Git;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {

		@BeforeSuite
		private void test1() {
			System.out.println("classA test1 @beforesite");
			
		}
		@AfterSuite
		private void test2() {
			System.out.println("classA test2 @aftersite");
			
			
		}
		@BeforeTest
		private void test3() {
			System.out.println("classA test3 @beforetest");
			
		}
		@AfterTest
		private void test4() {
			System.out.println("classA test4 @beforesite");
			
		}
		@BeforeClass
		private static  void test5() {
			System.out.println("classA test 5@beforesite");
			
		}
		@AfterClass
		private void test6() {
			System.out.println("classA test6 @beforesite");
			
		}
		@BeforeMethod
		private void test7() {
			System.out.println("classA test7 @beforesite");
			
		}
		@AfterMethod
		private void test8() {
			System.out.println("classA test8 @beforesite");
			
		}@Test
		private void test9() {
			System.out.println("classA test9 @beforesite");
			
		


	}

}
