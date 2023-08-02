import java.lang.*;
class OverRide_Super{
        void display(){
                System.out.println("Super Class");
        }
}
class OverRide_Sub extends OverRide_Super{
        void display(){
                System.out.println("Sub Class");
        }
}
class Override{
        public static void main(String args[]){
                OverRide_Sub sub = new OverRide_Sub();
                sub.display();
                OverRide_Super sup = new OverRide_Super();
                sup.display();
        }
}
