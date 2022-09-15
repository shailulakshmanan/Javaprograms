package com.edu;

import java.util.Scanner;

class Student{
	String studentname;
	int studentage;
	float studentfees;
	String studentemail;


void studentInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	studentname=sc.nextLine();
	System.out.println("Enter age");
	studentage=sc.nextInt();
	System.out.println("Enter fees");
	studentfees=sc.nextFloat();
	System.out.println("Enter email");
	studentemail=sc.next();
	}

void StudentDisplay() {
	System.out.println("Name="+studentname);
	System.out.println("Age="+studentage);
	System.out.println("Fees="+studentfees);
	System.out.println("Email="+studentemail);
	
}

	
}

public class StudentDetails {
	public static void main(String[] args) {
	System.out.println("main method");
	Student studentobject=new Student();
	studentobject.studentInput();
	studentobject.StudentDisplay();
}
}