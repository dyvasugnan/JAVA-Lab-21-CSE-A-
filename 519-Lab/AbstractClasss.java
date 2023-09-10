package java_codes;

abstract class Shape {
    public abstract int area();
    }

class Circle extends Shape {
     int  radius;

     Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (int)(3.14* radius * radius);
    }
}
class Rectangle extends Shape {
    int  length;
    int  breadth;

    public Rectangle(int  length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class AbstractClasss {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Circle area" + circle.area());
        System.out.println("Rectangle area" + rectangle.area());
    }
}