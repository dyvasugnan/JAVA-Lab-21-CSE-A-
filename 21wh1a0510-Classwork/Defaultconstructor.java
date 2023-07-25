import java.lang.*;

class P {
    int page;
    String Name;

    P(String name, int age) {
        Name = name;
        page = age;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + page);
    }
}

public class Defaultconstructor {
    public static void main(String args[]) {
        Person p = new Person("ABC",35);
        p.display();
    }
}
