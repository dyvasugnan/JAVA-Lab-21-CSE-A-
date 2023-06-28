import java.util.*;

class Box{
    int l;
    int b;

    Box(){
        l=5;
        b=7;
    }
    Box(int l,int b){
        this.l=l;
        this.b=b;
    }
    Box(Box box){
        l=box.l;
        b=box.b;
    }
    void area(){
        System.out.println("Area of rectangular box : "+l*b);
    }
}
class ConstructorOverloading{
    public static void main(String args[]){
        Box b1 = new Box();
        b1.area();
        Box b2 = new Box(20,5);
        b2.area();
        Box b3 = new Box(b2);
        b3.area();
    }
}