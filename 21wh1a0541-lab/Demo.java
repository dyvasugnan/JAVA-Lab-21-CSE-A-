package javaprograms;
class Shape {
    double l;
    Shape(double l) {
        this.l = l;
    }
}
class Rectangle extends Shape {
    private double b;
    public Rectangle(double l, double b) {
        super(l);
        this.b= b;
    }
    public double R_Area() {
        return this.l * this.b;
    }
}
class Square extends Shape {
    public Square(double l) {
        super(l);
    }
    public double S_Area() {
        return this.l * this.l;
    }
}
 class Demo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5.2, 4.1);
        System.out.println("Rectangle area: " + r.R_Area());
        Square s = new Square(3.0);
        System.out.println("Square area: " + s.S_Area());
    }
}
