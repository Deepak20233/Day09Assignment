package com.java;
import java.util.*;
public class EmpWageUsingClassAndMethod {
        int empWage=20;
        int sum;
        int numberOfDays;
        public void calculateWage() {
        	for (int i = 1; i <= numberOfDays; i++) {
                double isPresent = Math.random() * 3;
                
                if (isPresent >= 2) {
                    sum += empWage;
                    System.out.println("Employee is present");
                }
                else if (isPresent >= 1 && isPresent < 2) {
                    sum += (empWage/ 2);
                    System.out.println("Employee is partial present");
                }
                else {
                    System.out.println("Employee is absent");
                    System.out.println("Employee earned " + 0);
                }
                System.out.println("Employee total earning is check:" + sum);
        	}
		}
        
	public static void main(String[] args) {
		EmpWageUsingClassAndMethod obj = new EmpWageUsingClassAndMethod();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of days");
		obj.numberOfDays=sc.nextInt();
		obj.calculateWage();
	}

}
