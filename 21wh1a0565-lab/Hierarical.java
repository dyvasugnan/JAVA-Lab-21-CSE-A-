// Base class
class Number {
    int num1;
    int num2;
    
    Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    void subtract() {
        int result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }
}

// First level subclass
class SubtractionA extends Number {
    SubtractionA(int num1, int num2) {
        super(num1, num2);
    }
    
    void subtractA() {
        subtract();
    }
}

// Second level subclass
class SubtractionB extends Number {
    SubtractionB(int num1, int num2) {
        super(num1, num2);
    }
    
    void subtractB() {
        subtract();
    }
}

// Hierarical class
public class Hierarical {
    public static void main(String[] args) {
        SubtractionA objA = new SubtractionA(10, 5);
        objA.subtractA();
        
        SubtractionB objB = new SubtractionB(8, 3);
        objB.subtractB();
    }
}
