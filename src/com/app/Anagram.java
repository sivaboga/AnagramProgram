package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
	
	String str1=null;
	String str2=null;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first String:");
	str1=sc.next();
	System.out.println("Enter a second string:");
	str2=sc.next();
	//System.out.println("Check:"+check(str1,str2));
	if(check(str1,str2)==true) {
		System.out.println("The given strings are anagram.");
	}
	if(check(str1,str2)==false) {
		System.out.println("The give strings are not anagram.");
	}
	}
	public static boolean check(String str1,String str2) {
		 char[] charArray1 = str1.toCharArray();	//convert character array
		 char[] charArray2 = str2.toCharArray();	//convert character array
		 Arrays.sort(charArray1);					//sort array
		 Arrays.sort(charArray2);					//sort array
		return Arrays.equals(charArray1, charArray2);//compare array
	}
	
}
