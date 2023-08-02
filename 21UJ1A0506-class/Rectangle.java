class Shape {

    // calculateArea is member of shape class
    public int calculateArea(int length,int breadth) {
            return length * breadth;
    }
}


class Rectangle extends Shape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();  
        System.out.println("Area of rectangle : "+ rectangle.calculateArea(10,6)); 
    }

}