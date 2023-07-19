import java.util.*;
import java.lang.*;
interface A{
        int h = 6;
         void cal();
}
interface B{
        int h = 10;
//        public void cal();
}
class C implements A,B{
        int h;
        public void cal(){
                h = (A.h+B.h)/2;
                System.out.println("Height : "+h);
        }
}
class Interface{
        public static void main(String args[]){
                C obj = new C();
                obj.cal();
        }
}
