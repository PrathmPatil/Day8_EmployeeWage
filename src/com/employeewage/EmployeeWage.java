package com.employeewage;

import java.util.Random;

public class EmployeeWage {
  int rNumber;
	 public static void print() {
		 System.out.println("***************Welcome to Employee Wage Computation***************");
	 }
	 public static void  rNum() {
		 EmployeeWage employeewage=new EmployeeWage();
		 Random random= new Random();
		 employeewage.rNumber=random.nextInt(2);
		 System.out.println("Random Number is ::- "+employeewage.rNumber);
	 }
}
