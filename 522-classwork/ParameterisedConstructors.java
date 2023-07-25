package javaclass;
import java.util.*;
class Person {
    String Name;
    int Age;
    Person(String Name, int Age) {
        this.Name =Name;
        this.Age =Age;
    }
    
    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }
}
public class ParameterisedConstructors {
    public static void main(String args[]) {
        Person p = new Person("XYZ", 20);
        p.display();
    }
}