import java.lang.*;
class Animal {
    public void eat(){

        System.out.println(“Animal is eating.”);
    }
}

class Dog extends Animal{
    public void bark(){

        System.out.println(“Dog is barking.”);
    }
}
public class Main {
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        Dog myDog = new Dog();
        
        myDog.eat(); 
        myDog.bark();
    }
}