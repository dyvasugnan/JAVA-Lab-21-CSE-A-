import java.util.*;
class One{
        One(){
             System.out.println("Super Class");
        }
}
class Two extends One{
        Two(){
                System.out.println("Sub Class");
        }
}
class Single{
        public static void main(String args[]){
                Two t = new Two();
        }
}
