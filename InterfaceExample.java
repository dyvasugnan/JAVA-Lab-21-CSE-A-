interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Square implements Drawable {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLength);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();

        Square square = new Square(8);
        square.draw();
    }
}

