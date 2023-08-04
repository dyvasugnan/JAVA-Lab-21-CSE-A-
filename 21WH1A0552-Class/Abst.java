import java.util.*;
import java.lang.*;
abstract class Shape{
        abstract void cal(double x);
}
class Square extends Shape{
        void cal(double x){
                System.out.println("Square : "+x*x);
        }
}
class Cube extends Shape{
        void cal(double x){
                System.out.println("Cube : "+x*x*x);
        }
}
class Abst{
        public static void main(String args[]){
                Square s = new Square();
                s.cal(5.5);
                Cube c = new Cube();
                c.cal(3.0);
        }
}
