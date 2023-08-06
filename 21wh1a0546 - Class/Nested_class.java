/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Outer{
    class Inner{
        void show(){
            System.out.println("Inner class");
        }
    }
}
class Nested_class{
    public static void main(String[] args){
        Outer.Inner inn = new Outer().new Inner();
        inn.show();
    }
}
