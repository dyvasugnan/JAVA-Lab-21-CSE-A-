import java.util.*;
import java.lang.*;
class First{
        int x;
        Second s;
        First(Second s){
                this.s = s;
                x = 10;
        }
        void display(){
                System.out.println("X in first class : "+x);
                s.display();
                System.out.println("Y is second class : "+s.y);
                System.out.println("Obj2 reference  : "+s.hashCode());
        }
}
class Second{
        int y;
        Second(int y){
                this.y = y;
        }
        void display(){
                System.out.println("Y is second class : "+y);
        }
}
class ObjRef{
        public static void main(String args[]){
                Second sc = new Second(10);
                First f = new First(sc);
                f.display();
                System.out.println("Obj 1 reference : "+f.hashCode());
                System.out.println("Obj 2 reference : "+sc.hashCode());
        }
}
