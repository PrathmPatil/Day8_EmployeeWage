package com.employeewage;

import java.util.Random;

public class EmployeeWage {
	 public static void print() {
		 System.out.println("***************Welcome to Employee Wage Computation***************");
	 }
	 
}
  
class RNum{
	public int rNumber() {
		Random random =new Random();
		int numberR=random.nextInt(2);
		return numberR;
	}
}

class CalWage{
	public void calWage() {
		RNum rNum=new RNum();
		int a=rNum.rNumber();
		System.out.println(a);
		if(a==0) {
			System.out.println("Employee are Present");
		}
		else {
			System.out.println("Employee are absent");
		}
	}
	
	
}