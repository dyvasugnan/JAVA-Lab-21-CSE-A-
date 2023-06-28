import java.util.*;

class Outer{
    void display(){
        class Inner{
            void show(){
                System.out.println("Inner Class");
             }
        }
    Inner in = new Inner();
    in.show();
    }
}

public class NestedClass{
    public static void main(String args[]){
         Outer out = new Outer();
         out.display();
    }
}