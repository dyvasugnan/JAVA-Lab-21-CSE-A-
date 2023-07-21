class Animal
{
    void action(String str)
    {
        System.out.println("I " + str);
    }
    void lifetime(int lt)
    {
        System.out.println("My life time: " + lt);
    }
}

class Dog extends Animal
{
    String s;
    void details(String s)
    {
        this.s = s;
        action(s);
        lifetime(13);
    }
}

class Cat extends Animal
{
    String s;
    void details(String s)
    {
        this.s = s;
        action(s);
        lifetime(18);
    }
}

class Rabbit extends Animal
{
    String s;
    void details(String s)
    {
        this.s = s;
        action(s);
        lifetime(9);
    }
}

class Hierarchical
{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Rabbit r = new Rabbit();
        d.details("Bark");
        c.details("Play");
        r.details("Jump");
    }
}