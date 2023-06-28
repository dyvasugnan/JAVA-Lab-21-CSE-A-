import java.util.*;
class One{
    Two o2;
    One(Two o2){
        this.o2=o2;
        }
        int cube(int x){
            return o2.square(x)*x;
        }
}
class Two{
    Three o3;
    Two(Three o3){
        this.o3=o3;
        }
        int square(int x){
            return o3.getX(x)*x;
        }
}
class Three{
    int x;
    int getX(int x){
        return x;
    }
}
public class ObjectReference{
    public static void main(String a[]){
        Three obj3 = new Three();
        Two obj2 = new Two(obj3);
        One obj1 = new One(obj2);
        int r1=obj1.cube(3);
        System.out.println("Cube of X : "+r1);
        int r2=obj2.square(2);
        System.out.println("Square of X : "+r2);
        int r3=obj3.getX(1);
        System.out.println("Get x : "+r3);
        }
}
