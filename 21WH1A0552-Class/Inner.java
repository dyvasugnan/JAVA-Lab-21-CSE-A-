import java.util.*;
class Outer{
        class TestInner{
                void show(){
                        System.out.println("Inner Class");
                }
        }
}
class Inner{
        public static void main (String args[]){
                Outer.TestInner in = new Outer().new TestInner();
                in.show();
        }
}
