//Write a java program to represent Abstract class with example.package javalab;
package javalab;
abstract class Shape{
	abstract void numberOfSides();
}
class Trapezoid{
	void numberOfSides(){
		System.out.println("The no. of side's in trapezoidal are6");
	}
}

class Triangle{
	void numberOfSides(){
		System.out.println("The no. of side's in triangle are:3 ");
	}
}

class Hexagon{
	void numberOfSides(){
		System.out.println("The no. of side's in hexagon are:6 ");
	}
}

class AbstractClass{
	public static void main(String args[]){
		Trapezoid obj1 = new Trapezoid(); 
		Triangle obj2 = new Triangle(); 
		Hexagon obj3 = new Hexagon(); 
		obj1.numberOfSides();
		obj2.numberOfSides(); 
		obj3.numberOfSides();
	}
}
