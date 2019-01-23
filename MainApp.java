package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.bl.StudentScheduler;

public class MainApp {

	public static Scanner sc=new Scanner(System.in); 
	public static StudentScheduler ss=new StudentScheduler();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		while(true)
		{
		System.out.println("enter 1-add \n 2-show \n 3-exit");
		n=sc.nextInt();
		switch(n)
		{
		case 1: addStudent();
		break;
		
		case 2: showStudent();
		break;
		
		case 3: System.exit(0);
		break;
		}
		}

	}
	private static void showStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter roll no");
		int rl = sc.nextInt();
		ss.showData(rl);
		
	}
	private static void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter roll no");
		int rl = sc.nextInt();
		System.out.println("Enter name");
		String na = sc.next();
		ss.addData(rl, na);
		
	}

}
