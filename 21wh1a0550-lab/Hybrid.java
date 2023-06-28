package javalab;
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

class Bird extends Animal implements Fly {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Fish extends Animal implements Swim {
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

class FlyingFish extends Fish implements Fly {
    public void fly() {
        System.out.println("FlyingFish is flying.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat(); // Output: Animal is eating.
        bird.fly(); // Output: Bird is flying.

        Fish fish = new Fish();
        fish.eat(); // Output: Animal is eating.
        fish.swim(); // Output: Fish is swimming.

        FlyingFish flyingFish = new FlyingFish();
        flyingFish.eat(); // Output: Animal is eating.
        flyingFish.swim(); // Output: Fish is swimming.
        flyingFish.fly(); // Output: FlyingFish is flying.
    }
}

