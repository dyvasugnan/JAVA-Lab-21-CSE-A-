package javaprograms;
interface Shape {
 double PI = 3.14159;
 double calculateArea();
 double calculatePerimeter();
}
class Circle implements Shape{
  double r;
  Circle(double r) {
     this.r = r;
 }
 public double calculateArea() {
     return PI * r * r;
 }
 public double calculatePerimeter() {
     return 2 * PI * r;
 }
}
class Rectangle implements Shape {
  double l;
  double w;
 public Rectangle(double l, double w) {
     this.l = l;
     this.w = w ;
 }
 public double calculateArea() {
     return l * w;
 }
 public double calculatePerimeter() {
     return 2 * (l + w);
 }
}
public class Interface {
 public static void main(String[] args) {
     Circle c = new Circle(5.0);
     System.out.println("Circle Area: " + c.calculateArea());
     System.out.println("Circle Perimeter: " + c.calculatePerimeter());
     Rectangle r = new Rectangle(4.0, 3.0);
     System.out.println("Rectangle Area: " + r.calculateArea());
     System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
 }
}
