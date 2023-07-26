package javaclss;

	abstract class Shape
	{
	   abstract public void printArea(int a, int b);
	}
	class Rectangle extends Shape
	{
	    public void printArea(int a, int b)
	    {
	        System.out.println("Area of rectangle : " + (a * b));
	    }    
	}
	class Triangle extends Shape
	{
	     public void printArea(int a, int b)
	     {
	         System.out.println("Area of Triangle : " + (0.5 * a * b));
	     }
	}
	class Circle extends Shape
	{
	    public void printArea(int a, int b)
	    {
	        System.out.println("Area of Circle : " + (3.14 * a * a));
	    }
	}
	public class AbstractClass {

	    public static void main(String[] args) {
	        Shape r = new Rectangle();
	        r.printArea(4, 5);
	        Shape t = new Triangle();
	        t.printArea(4, 5);
	        Shape c = new Circle();
	        c.printArea(4, 4);
	    }
	}
