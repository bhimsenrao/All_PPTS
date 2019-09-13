/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.app;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecTest {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestAssertions.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
      System.out.println("Number of Tests :"+result.getRunCount());
      System.out.println("Failed Tests :"+result.getFailureCount());

   }
} 