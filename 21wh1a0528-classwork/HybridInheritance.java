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
    int a;
    void add(){
         a = x+y;
         System.out.println("X + Y = "+a);
    }
}
class D extends B{
    int s;
    void minus(){
        s = x-y;
        System.out.println("X - Y = "+s);
    }
}
class HybridInheritance{
    public static void main(String args[]){
        C c = new C();
         c.getX();
         c.getY();
         c.add();
        D d = new D();
         d.getX();
         d.getY();
         d.minus();
    }
}