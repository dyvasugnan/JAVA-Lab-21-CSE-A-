package javaprograms;

class Animal {
 public void eat() {
     System.out.println("Animal is eating.");
 }
}

class Dog extends Animal {
 public void bark() {
     System.out.println("Dog is barking.");
 }
}

class Cat extends Animal {
 public void meow() {
     System.out.println("Cat is meowing.");
 }
}

public class HierarchicalInheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat(); 
     dog.bark(); 

     Cat cat = new Cat();
     cat.eat(); 
     cat.meow(); 
 }
}
