package com.ilo;
public class A {  
B b1;  //byName object B b and id=b both should be same
A()
{
	System.out.println("a is created");
}  
public B getB()
{  
   return b1;  
}  
public void setB(B b) 
{  
   this.b1 = b;  
}  
void print()
{
	System.out.println("hello a");
	}  
void display(){  
   print();  
   b1.print();  
}  
}