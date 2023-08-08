import java.util.*;
class MyException extends Exception{
        MyException(String str){
                super(str);
        }
}
class UserExcep{
        public static void main(String args[]){
               try{
                       int x = 10;
                       if(x > 1){
                               MyException me = new MyException("Wrong Numebr");
                               throw me;
                       }
               }
               catch(MyException me){
                       System.out.println(me);
               }
        }
}
