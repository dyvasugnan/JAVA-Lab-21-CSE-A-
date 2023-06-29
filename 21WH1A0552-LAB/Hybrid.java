import java.util.*;
class One{
        One(){
                System.out.println("Super Class");
        }
}
class Two extends One{
        Two(){
                System.out.println("Two, Sub Class of One");
        }
}
class Three extends One{
        Three(){
                System.out.println("Three, Sub Class of One");
        }
}
class Four extends Three{
        Four(){
                System.out.println("Four, Sub Class of Three");
        }
}
class Hybrid{
        public static void main(String args[]){
                Four f = new Four();
                Two t = new Two();
        }
}
