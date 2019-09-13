package com.java.app;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Trendz IT
 */
public class TestCal {
	@Test
	public void testFindMax(){
		assertEquals(4,Calculator.findMax(new int[]{-1,3,4,2}));
		assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,4,-2}));
	}
   public static void main(String ar[]){
         new TestCal().testFindMax();
Result result = JUnitCore.runClasses(TestCal.class);
      
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}
