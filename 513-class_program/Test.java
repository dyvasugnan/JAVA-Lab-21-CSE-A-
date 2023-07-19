package javalab;
class Constr {
    int i;

    Constr() {
        System.out.println("This is the default constructor");
    }

    Constr(int x) {
        i = x;
        System.out.println("Parameterized");
    }

    Constr(Constr other) {
        i = other.i;
        System.out.println("Copy constructor called");
    }
}

public class Test {
    public static void main(String[] args) {
       
    	Constr obj1 = new Constr(); 
    	Constr obj2 = new Constr(13); 
    	Constr obj3 = new Constr(obj2); 

        //here are the 'i' values
        System.out.println("obj1.i: " + obj1.i);
        System.out.println("obj2.i: " + obj2.i);
        System.out.println("obj3.i: " + obj3.i);
    }
}
