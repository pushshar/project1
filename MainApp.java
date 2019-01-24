package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.beans.Course;
import com.capgemini.beans.Student;
import com.capgemini.bl.StudentScheduler;

public class MainApp {

	public static Scanner sc=new Scanner(System.in); 
	public static StudentScheduler ss=new StudentScheduler();
	 
	public static int num;
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

		
		System.out.println("Enter roll no");
		int rl = sc.nextInt();
		
		Student stu=ss.showData(rl);
		if(stu==null)
		{
			System.out.println("not found");
		}
		System.out.println(stu.getRollno()+ " "+ stu.getName());
		Course[] tmp=stu.getEnroll();
		int i=0;
		for(i=0;i<stu.getNoc();i++) {
			System.out.println(tmp[i].getId()+" "+tmp[i].getCname());
		}
		
		
		
		
		
	}
	private static void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter roll no");
		int rl = sc.nextInt();
		int flag=ss.checkROll(rl);
		if(flag==0)
		{
			System.out.println("already exist");
		}
		else if(flag==2)
		{
			System.out.println("database is empty");
		}
		else
		{
		System.out.println("Enter name");
		String na = sc.next();
		ss.addData(rl, na);
		System.out.println("enter your total number of course you want to enroll");
		num=sc.nextInt();
		Course[] c=new Course[num];
		System.out.println("enter your course id and name");
		for(int i=0;i<num;i++)
		{
			c[i]=new Course();
			c[i].setId(sc.nextInt());
			c[i].setCname(sc.next());
					
		}
		ss.addCourse(c,num);
		}
	}

}