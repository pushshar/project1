package com.capgemini.bl;

import com.capgemini.beans.Student;

public class StudentScheduler {
	
	private Student[] st = new Student[10];
	private  int counter;

	public void showData(int rl) {
		// TODO Auto-generated method stub
		for(int i=0;i<counter;i++) {
			if(st[i].getRollno()==rl) {
				System.out.println(st[i].getName()+" "+st[i].getRollno());
			}
		}
		
	}

	public void addData(int rl, String na) {
		// TODO Auto-generated method stub
		st[counter] = new Student();
		st[counter].setRollno(rl);
		st[counter].setName(na);
		counter++;
	}

	
}
