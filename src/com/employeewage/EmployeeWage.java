package com.employeewage;

import java.util.Random;

public class EmployeeWage {
  int rNumber;
  int rNumberPartTime;
	 public static void print() {
		 System.out.println("***************Welcome to Employee Wage Computation***************");
	 }
	 /*
	  * Random number for check part time or full time
	  */
	 public int rNum() {
		 Random random =new Random();
		 rNumber=random.nextInt(2);
		 return rNumber;
	 }
	 public void partFull() {
		 EmployeeWage employeewage=new EmployeeWage();
		 int a=employeewage.rNum();
		 System.out.println();
		 switch(a) {
		 case 0: System.out.println("Employee Do FullTime Work. ");
		 break;
		 default:System.out.println("Employee Do PartTime Work. ");
		 break;
		 }
		 System.out.println("Total Wage of the day is "+20*8);
	 }
	 
}
