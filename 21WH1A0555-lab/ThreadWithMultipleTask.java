package javalab;
import java.util.*;
public class ThreadWithMultipleTask extends Thread{
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}
}
class MyThread extends Thread{
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	public void run() {
		task1();
		task2();
		task3();
	}
void task1() {
	System.out.print("Enter any two numbers: ");
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
}
void task2() {
	int res = num1+num2;
	System.out.println("Addition of two numbers: "+ res);
}
void task3() {
	int res = num1*num2;
	System.out.println("Product of two numbers: "+ res);
}
}