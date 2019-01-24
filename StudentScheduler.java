package com.capgemini.bl;

import com.capgemini.beans.Course;
import com.capgemini.beans.Student;

public class StudentScheduler {
	
	private Student[] st = new Student[10];
	private Course[] sub;
	private  int counter;

	public Student showData(int rl) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0;i<counter;i++) {
			if(st[i].getRollno()==rl) {
				return st[i];
				
			}
		}
		return null;
		
		
		
		
	}

	public void addData(int rl, String na) {
		// TODO Auto-generated method stub
		st[counter] = new Student();
		st[counter].setRollno(rl);
		st[counter].setName(na);
		
		
	}

	public void addCourse(Course[] cc, int n) {
		// TODO Auto-generated method stub
		st[counter].setEnroll(cc);
		st[counter].setNoc(n);
		counter++;
		
	}

	public String checkROll(int check) {
		// TODO Auto-generated method stub
		int i=0;
		if(counter==0)
		{
			return "move on";
		}
		for(i=0;i<counter;i++) {
			if(st[i].getRollno()==check) {
				return "Roll number already exist!! try again";
				
				
			}
			
		
		
	}
		return null;
	}
	
}