import java.util.*;

abstract class Shape{
    public int x, y;
    public abstract void printArea();
}

class Rectangle extends Shape{
    public void printArea()
    {
        System.out.println("Area of Rectangle: " + (x*y));
    }
}

class Triangle extends Shape{
    public void printArea()
    {
        System.out.println("Area of Triangle: " + ((x*y) / 2));
    }
}

class Circle extends Shape{
    public void printArea()
    {
        System.out.println("Area of Circle: " + (22 * x * x) / 7);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Rectangle r = new Rectangle();
        r.x = x1;
        r.y = y1;
        r.printArea();
        Triangle t = new Triangle();
        t.x = x1;
        t.y = y1;
        t.printArea();
        Circle c = new Circle();
        c.x = x1;
        c.printArea();
        sc.close();
    }  
}
