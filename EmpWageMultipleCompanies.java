package com.java;

public class EmpWageMultipleCompanies extends CompanyA {

	public static void main(String[] args) {
		EmpWageMultipleCompanies obj= new EmpWageMultipleCompanies();
		CompanyA objA= new CompanyA();
		objA.empWage = 20;
		objA.numberOfDays= 20;
		objA.sum = 0;
	    System.out.println("Calculate Company A wages ---");
		obj.calculateWage(objA.empWage ,objA.sum,objA.numberOfDays);
		
		CompanyB ObjB= new CompanyB();
		ObjB.empWage = 20;
		ObjB.numberOfDays= 21;
		ObjB.sum = 0;
	    System.out.println("Calculate Company B wages ---");
		obj.calculateWage(ObjB.empWage ,ObjB.sum,ObjB.numberOfDays);
	}
	 public void calculateWage(int empWage, int sum, int numberOfDays) {
	     	for (int i = 1; i <= numberOfDays; i++) {
	             double isPresent = Math.random() * 3;
	             
	             if (isPresent >= 2) {
	                 sum += empWage;
	                 System.out.println("Employee is present on Day" + i);
	             }
	             else if (isPresent >= 1 && isPresent < 2) {
	                 sum += (empWage/ 2);
	                 System.out.println("Employee is partial present on Day" + i);
	             }
	             else {
	                 System.out.println("Employee is absent on Day" + i);
	                 //System.out.println("Employee earned " + 0);
	             }
	            
	     	}
	     	 System.out.println("Employee total earning :" + sum);
	}
}
