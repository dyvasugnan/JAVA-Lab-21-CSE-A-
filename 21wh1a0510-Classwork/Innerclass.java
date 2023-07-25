class Outer {
    char x = 'X';

    Outer() {
        System.out.println("constructor of Outer class");
    }

    class Inner {
        void show() {
            System.out.println("Inner class");
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.show();
        System.out.println("The character entered is: " + outerObj.x);
    }
}
