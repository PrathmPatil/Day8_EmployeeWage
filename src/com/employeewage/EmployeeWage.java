package com.employeewage;

import java.util.Random;

public class EmployeeWage {
  int rNumber;
	 public static void print() {
		 System.out.println("***************Welcome to Employee Wage Computation***************");
	 }
	 public static int rNum() {
		 EmployeeWage employeewage=new EmployeeWage();
		 Random random= new Random();
		 employeewage.rNumber=random.nextInt(2);
		 return employeewage.rNumber;
	 }
	 public static void dailyWage() {
		 EmployeeWage employeewage=new EmployeeWage();
		 int a=employeewage.rNum();
		 if(a==1) {
			 int wage=20*8;
			 System.out.println("Employe are present.");
			 System.out.println("Total wage of the Days is "+wage);
		 }
		 else {
			 System.out.println("Employe are absent.");
		 }
		 
	 }
}
