// Base class
class Number {
    int num1;
    int num2;
    
    Number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

// First level subclass
class Multiplication extends Number {
    Multiplication(int num1, int num2) {
        super(num1, num2);
    }
    
    int multiply() {
        return num1 * num2;
    }
}

// Main class
public class Hybrid {
    public static void main(String[] args) {
        Multiplication obj = new Multiplication(5, 3);
        int result = obj.multiply();
        System.out.println("Multiplication Result: " + result);
    }
}
