import java.util.*;
class One{
        One(){
                System.out.println("Super Class");
        }
}
class Two extends One{
        Two(){
                System.out.println("Sub Class 1");
        }
} 
class Three extends Two{
        Three(){
                System.out.println("Sub Class 2");
        }
}
class Multilevel{
        public static void main(String args[]){
                Three t = new Three();
        }
}
