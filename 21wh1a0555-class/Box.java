import java.lang.*;
class Box{
    int length,breadth,area;
    Box(){
        length=20;
        breadth=15;
        area=length*breadth;
    }
    Box(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        area=length*breadth;
    }
    Box(Box b){
        length = b.length;
        breadth = b.breadth;
    }
    void area(){
        System.out.println("Area: "+ area);
    }
}
class Test{
    public static void main(String[] args){
        Box b1 = new Box();
        b1.area();
        Box b2 = new Box(10,20);
        b2.area();
        Box b3 = new Box(b2);
        b2.area();
    }
}