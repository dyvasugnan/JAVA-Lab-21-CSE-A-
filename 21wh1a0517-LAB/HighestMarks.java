/*You are creating a student grading system. Each student has a name, student ID, and a list of marks for different subjects.
Implement a class in Java to represent a student and display the student’s name who is having highest score.*/

package javalab;

import java.util.*;

public class Lab2_12_6_23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("size:");
	        int n=sc.nextInt();
	       String name,stuName="";
	       int id,marks,max=0,stuId=0,stuMarks=0;
	  System.out.println("enter details: ");
	       for(int i=0;i<n;i++){
	           name = sc.next();
	           id = sc.nextInt();
	           marks = sc.nextInt();
	           if(max<marks){
	               max=marks;
	               stuName=name;
	               stuId=id;
	               stuMarks=marks;
	           }
	       }
	       System.out.print(stuName+"\n"+stuId+"\n"+stuMarks+"\n");
	}

}