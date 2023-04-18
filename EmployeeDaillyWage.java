package com.java;

public class EmployeeDaillyWage {

	public static void main(String[] args) {
		Double isPresent=Math.random();
		int empWage=20;
		int sum=0;
		  if(isPresent>=0.5) {
            System.out.println("Employee is present");	
            sum=empWage*8;
            System.out.println("Employee wage is " +  sum);
		  }
		  else {
			 System.out.println("Employee is Absent");
		     System.out.println("Employee wage is"  +  sum);
		  }
	}

	}

