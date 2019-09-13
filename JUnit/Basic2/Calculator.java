/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.app;
public class Calculator {

	public static int findMax(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
}
