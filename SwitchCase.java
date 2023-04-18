package com.java;

public class SwitchCase {

	public static void main(String[] args) {
		 double value=Math.random()*3;
		 int isPresent = (int)value;
		 
		 int empWage=20; 
		 switch(isPresent)
		 {
		 case 1:
			 System.out.println("Employee is full time");
			 empWage=empWage*8;
			 break;
			 
		 case 2:
			 System.out.println("Employee is part time");
			 empWage=empWage*4;
		     break;
		     
		 case 0:
		 System.out.println("Employee is absent");
		 empWage=empWage*0;
		 break;
		 }
		 System.out.println("Employee wages is :" + empWage);
	}
}
