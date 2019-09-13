/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.app;
/**
 *
 * @author Trendz IT
 */
public class FunctionalTest {
   	//method that returns maximum number
	public static int findMax(int arr[]){
		int max=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	//method that returns cube of the given number
	public static int cube(int n){
		return n*n*n;
	}
	//method that returns reverse words 
	public static String reverseWord(String str){

		StringBuilder result=new StringBuilder();
		java.util.StringTokenizer tokenizer=new java.util.StringTokenizer(str," ");

		while(tokenizer.hasMoreTokens()){
		StringBuilder sb=new StringBuilder();
		sb.append(tokenizer.nextToken());
		sb.reverse();

		result.append(sb);
		result.append(" ");
		}
		return result.toString();
	}
}