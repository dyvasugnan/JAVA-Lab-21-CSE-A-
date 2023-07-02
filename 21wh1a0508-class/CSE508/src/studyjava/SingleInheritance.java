package studyjava;

public class SingleInheritance {
    public void display() {
        System.out.println("Class A");
    }

    public static void main(String[] args) {
        B objB = new B();
        objB.display();
        objB.print();
    }
}

class B extends SingleInheritance {
    public void print() {
        System.out.println("Class B");
    }
}
