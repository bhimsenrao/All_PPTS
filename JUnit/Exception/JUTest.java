/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.assertEquals;
public class JUTest {
    @Test(expected = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Exception Test");     
      assertEquals( "no", ArithTest.divNum(10, 10));     
   }
public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JUTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }

}
