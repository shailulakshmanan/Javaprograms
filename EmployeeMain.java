package com.edu;

		import java.util.Scanner;

		class Employee{
			//instance variable :the varibles declared in the class
			 int age; //int 0
			 String name;//String null
			 float salary; //0.0
			
			public void inputData() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name");
				name=sc.nextLine();
				System.out.println("Enter age");
				age=sc.nextInt();
				System.out.println("Enter salary");
				salary=sc.nextFloat();
			}
			
			public void employeeDisplay() { 
				System.out.println("Name="+name);
				System.out.println("age="+age);
				System.out.println("salary="+salary);
			}
		}

		public class EmployeeMain {

			public static void main(String[] args) {
				
				System.out.println("main method");
				Employee employeeobject1=new Employee(); //Object creation
				employeeobject1.inputData();
				employeeobject1.employeeDisplay();
				Employee employeeobject2=new Employee(); //Object creation
				employeeobject2.inputData();
				employeeobject2.employeeDisplay();
				
			}

		}


	