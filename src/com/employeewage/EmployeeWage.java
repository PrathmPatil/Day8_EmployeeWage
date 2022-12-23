package com.employeewage;

import java.util.Random;

public class EmployeeWage {
  int rNumber;
  int present=0;
  int wagePerHr=20;
  int hrInDay=8;
  int limitHr=100;
	 public static void print() {
		 System.out.println("***************Welcome to Employee Wage Computation***************");
	 }
	 /*
	  * Random number for check part time or full time
	  */
	 public int rNum() {
		 Random random =new Random();
		 for(int i=0;i<30;i++) {
			 rNumber=random.nextInt(2);
			 switch(rNumber) {
			 case 0: present++;
			 break;
			 }
		 }
		 return present;
	 }
	 public void wageMonth() {
		 EmployeeWage employeewage=new EmployeeWage();
		 int a=employeewage.rNum();
		 System.out.println(); 
		 
			 System.out.println("Total Wage of the Month is "+wagePerHr*hrInDay*present);
		  }
	 
}
