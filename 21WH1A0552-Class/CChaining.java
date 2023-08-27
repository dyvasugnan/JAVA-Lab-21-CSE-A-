import java.util.*;
class Test{
        int a,b,c,d;
        Test(int p,int q){
                a = p;
                b = q;
        }
        Test(int p,int q,int r){
                this(p,q);
                c = r;
        }
        Test(int p,int q,int r,int s){
                this(p,q,r);
                d = s;
        }
        void display(){
                System.out.println(a+" "+b +" "+c+ " "+d+" ");
        }
}
class CChaining{
        public static void main(String args[]){
                Test t = new Test(9,10,11,12);
                t.display();
        }
}
