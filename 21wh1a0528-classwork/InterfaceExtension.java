interface Shape {
    void draw();
}

interface Color extends Shape {
    void setColor(String color);
}

class Rectangle implements Color {
    String color;
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void getColor(){
        System.out.println("Color : "+color);
    }
}

public class InterfaceExtension{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        r.setColor("Red");
        r.getColor();
    }
}
