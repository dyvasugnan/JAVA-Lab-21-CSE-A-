import java.util.*;
class One{
        One(){
                System.out.println("Super Class");
        }
}
class Two extends One{
        Two(){
                System.out.println("TWO,Sub Class of One");
        }
}
class Three extends One{
        Three(){
                System.out.println("THREE,Sub Class of One");
        }
}
class Hierarchy{
        public static void main(String args[]){
                Three t = new Three();
                Two th = new Two();
        }
}
