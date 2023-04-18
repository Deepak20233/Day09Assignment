package com.java;
import java.util.*;
public class PartTimeEmpWage {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter wage of employee");
	        int wageOfEmployee = sc.nextInt();
	        int sum = 0;
	        System.out.println("Please enter number of days");
	        int numberOfDays = sc.nextInt();

	        for (int i = 1; i <= numberOfDays; i++) {
	            double isPresent = Math.random() * 3;
	        
	            if (isPresent >= 2) {
	                sum += wageOfEmployee;
	                System.out.println("Employee is present");
	            }
	            else if (isPresent >= 1 && isPresent < 2) {
	                sum += (wageOfEmployee / 2);
	                System.out.println("Employee is partial present");
	            }
	           
	         
	            else {
	                System.out.println("Employee is absent");
	                System.out.println("Employee earned " + 0);
	            }
	        }
	        System.out.println("Employee earned " + sum);
	        sc.close();
	    }

	}

