import java.util.*;

class Person {
    String fullName;
    int personAge;
    
    Person(String fullName, int personAge) {
        this.fullName = fullName;
        this.personAge = personAge;
    }
    
    void display() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + personAge);
    }
}

public class Parameterisedconstructor {
    public static void main(String args[]) {
        Person p = new Person("ABCD", 19);
        p.display();
    }
}
