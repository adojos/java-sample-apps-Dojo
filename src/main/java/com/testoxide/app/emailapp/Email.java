package com.testoxide.app.emailapp;

import java.util.Scanner;


public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String departmentName;
	private String mailboxCapacity;
	private String alternateEmail;
	
	
	
	// Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;		
		this.departmentName = getDepartment();
		this.password = randomPassword(8);
		
		System.out.println("Email Created : " + this.firstName + "." + this.lastName );
		System.out.println("Your Department : " + this.departmentName);
		System.out.println("Your Password : " + this.password);
		
	}
		
	// Ask for department
	private String getDepartment() {
		
		System.out.println("DEPARTMENT CODES\n1 for Sales \n2 for Development\n3 for Accounting\n0 for More\n Enter Department Code : ");
		
		Scanner intChoice = new Scanner(System.in);
		int depChoice = intChoice.nextInt();
		
		if (depChoice==1) {return "sales";}
		else if (depChoice==2) {return "development";}
		else if (depChoice==3) {return "accounting";}
		else {return "";}
		
	}
	
	// Get random password
	private String randomPassword (int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char [] password = new char[length];
		
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	

	// Set mailbox capacity
	
	// set alternative email
	
	// change password
	
	
	
	
	

}
