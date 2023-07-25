import java.lang.*;

class Demo {
    String name;
    int age;

    Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Demo(Demo d) {
        this.name = d.name;
        this.age = d.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Copyconstructor {
    public static void main(String args[]) {
        Demo d1 = new Demo("XYZ", 20);
        Demo d2 = new Demo(d1);

        
        System.out.println("Details of person1:");
        d1.display();

        System.out.println("\nDetails of person2 (copy of person1):");
        d2.display();
    }
}

