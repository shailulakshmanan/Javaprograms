package com.cons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class product {
	String pname;
	float price;
	int pid;
	product(){
		pname=null;
		price=0;
		pid=0;
	}
	void inputProductDetails() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter product name");
		pname = br.readLine();
		System.out.println("Enter product price");
		price = Float.parseFloat(br.readLine());
		System.out.println("Enter productid");
		pid=Integer.parseInt(br.readLine());
		}
	
	void productdetails() {
		System.out.println("name of the product ="+pname);
		System.out.println("product price is"+price);
		System.out.println("product id "+pid);
	}
	
}
public class ProductMain {

	public static void main(String[] args) throws IOException {  
		product ob = new product();
		ob.inputProductDetails();
		ob.productdetails();

	}

}
