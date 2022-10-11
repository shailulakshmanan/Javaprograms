package com.inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException{
		int sid;
		String sname;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter studentid");
		sid=Integer.parseInt( br.readLine());
		System.out.println("Enter name of the student");
		sname=br.readLine();
		
		System.out.println("id="+sid);
		System.out.println("name ="+sname);
		

	}
}


