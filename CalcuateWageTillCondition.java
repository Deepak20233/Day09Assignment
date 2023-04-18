package com.java;
import java.util.*;
public class CalcuateWageTillCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empWage=20;
		int sum=0;
		int numberOfDays=20;
		int numberOfHours=0;
        for (int i = 1; i <= numberOfDays; i++) {
            double isPresent = Math.random() * 3;
            
            if (isPresent >= 2) {
                sum += empWage;
                numberOfHours= numberOfHours+8;
                System.out.println("Employee is present");
            }
            else if (isPresent >= 1 && isPresent < 2) {
                sum += (empWage/ 2);
                numberOfHours= numberOfHours+4;
                System.out.println("Employee is partial present");
            }
            else {
                System.out.println("Employee is absent");
                System.out.println("Employee earned " + 0);
            }
            
            if(numberOfHours<=100 && numberOfDays<=20)
            System.out.println("Employee earned " + sum);
            sc.close();
}
	}
}
