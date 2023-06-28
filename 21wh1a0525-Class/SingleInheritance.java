class Animal
{  
    void eat()
    {
    	System.out.println("It eats");
    }  
}
class Dog extends Animal
{  
    void bark()
    {
    	System.out.println("It barks");
    }  
}  
class SingleInheritance
{  
    public static void main(String args[])
    {  
    	Dog d = new Dog();  
    	d.bark();  
    	d.eat();  
    }
}  
