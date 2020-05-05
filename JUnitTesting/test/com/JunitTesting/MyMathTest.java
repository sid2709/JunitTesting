package com.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Test
	void test1() {
		int sum = myMath.sum(new int[] {1,2,3});
		assertEquals(6, sum);
	}
	
	@Test
	void test2() {
		int sum = myMath.sum(new int[] {3});
		assertEquals(3, sum);
	}
	
	@Test
	void testAssertTrue() {
		boolean condt = true;
		assertTrue(condt);
	}
	
	@Test
	void testAssertFalse() {
		boolean condt = true;
		//assertFalse(condt);
	}
	
	@Before
	void testBeginning() {
		System.out.println("Beginning of every test");
	}
	
	@After
	void testending() {
		System.out.println("Ending of every test");
	}
	
	//as before class hence static
	@BeforeClass
	public static void testB4Class() {
		System.out.println("Before class");
	}

	//as after class hence static
	@AfterClass
	public static void testAfterClass() {
		System.out.println("After class");
	}
}
