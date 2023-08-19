import java.util.*;
import java.lang.*;
class One{
        int i,j;
        One(){
                System.out.println("Super Class");
        }
        One(int a){
              i = a;
        }
        One(int a,int b){
                i = a;
                j = b;
        }
}
class Two extends One{
        int i,j;
        Two(int a,int b){
                super();
                j = b;
        }
}
class ConstOver{
        public static void main(String args[]){
                One o = new One(10);
                Two t = new Two(30,40);
        }
}
