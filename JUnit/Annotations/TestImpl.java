/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.app;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestImpl {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindMax(){
		System.out.println("test case find max");
		assertEquals(4,FunctionalTest.findMax(new int[]{1,3,4,2}));
		assertEquals(-2,FunctionalTest.findMax(new int[]{-12,-3,-4,-2}));
	}
	@Test
	public void testCube(){
		System.out.println("test case cube");
		assertEquals(27,FunctionalTest.cube(3));
	}
	@Test
	public void testReverseWord(){
		System.out.println("test case reverse word");
		assertEquals("sanjay",FunctionalTest.reverseWord("yajnas"));
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}
public static void main(String ar[]){

     Result result= JUnitCore.runClasses(TestImpl.class);
     for(Failure f:result.getFailures()){
          System.out.println(f.getMessage());
     }
     System.out.println(result.wasSuccessful());
}
}