//Write a java program to display the employee details using Scanner class.
package javalab;

import java.util.Scanner;

public class EmployeeDetails {
	int Id;
	String Name;
	int Age;
	long Salary;
	void GetData(){
	Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Employee Id : ");
		Id = Integer.parseInt(sc.nextLine());
		System.out.print("\n\tEnter Employee Name : ");
		Name = sc.nextLine();
		System.out.print("\n\tEnter Employee Age : ");
		Age = Integer.parseInt(sc.nextLine());
		System.out.print("\n\tEnter Employee Salary : ");
		Salary = Integer.parseInt(sc.nextLine());
	}
	void PutData() {
		System.out.print("\n\t" + Id + "\t" +Name + "\t" +Age + "\t" +Salary);
	}
 
	public static void main(String args[]){
		EmployeeDetails[] Emp = new EmployeeDetails[3];
		int i;
		for(i=0;i<3;i++)
			Emp[i] = new EmployeeDetails(); 
		for(i=0;i<3;i++){
			System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
			Emp[i].GetData();
		}
		System.out.print("\nDetails of Employees\n");
		for(i=0;i<3;i++)
		Emp[i].PutData();
	 	}
	 }