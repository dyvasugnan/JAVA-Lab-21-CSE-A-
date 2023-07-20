import java.util.*;
abstract class Shape{
    abstract void calculate(double x);
}
class Square extends Shape{
    void calculate(double x){
        System.out.println(x*x);
    }
}
class Cube extends Shape{
    void calculate(double x){
        System.out.println(x*x*x);
    }
}
class SquareRoot extends Shape{
    void calculate(double x){
        System.out.println(Math.sqrt(x));
    }
}
class AbstractClass{
    public static void main(String args[]){
        Square s1= new Square();
        s1.calculate(5.0);
        SquareRoot s3 = new SquareRoot();
        s3.calculate(16);
        Cube s2 = new Cube();
        s2.calculate(3);
    }
}