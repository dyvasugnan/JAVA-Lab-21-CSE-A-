import java.util.*;
class A{
    int x;
    void getX(){
        System.out.print("Enter X : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }
}
class B extends A{
    int y;
    void getY(){
        System.out.print("Enter Y : ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
    }
}
class C extends B{
    int z,p;
    void getZ(){
        System.out.print("Enter Z : ");
        Scanner sc = new Scanner(System.in);
        z = sc.nextInt();
    }
    void product(){
        p=x*y*z;
        System.out.println("X * Y * Z = "+p);
    }
}
class MultilevelInheritance{
    public static void main(String args[]){
        C c = new C();
        c.getX();
        c.getY();
        c.getZ();
        c.product();
    }
}