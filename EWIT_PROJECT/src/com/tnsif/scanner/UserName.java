package com.tnsif.scanner;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your phone number");
		long phno=sc.nextLong();
		System.out.println("Enter the gender by typing F or M");
		char gender=sc.next().charAt(0);
		System.out.println("Hello "+name+ "Calling you through this number"+ phno);
		System.out.println("Gender is "+gender);
School s=new School();
School.m1();
	}

}