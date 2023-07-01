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
class Addition extends Number {
    Addition(int num1, int num2) {
        super(num1, num2);
    }
    
    int add() {
        return num1 + num2;
    }
}

// Second level subclass
class ExtendedAddition extends Addition {
    ExtendedAddition(int num1, int num2) {
        super(num1, num2);
    }
    
    int addThreeNumbers(int num3) {
        return add() + num3;
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {
        ExtendedAddition obj = new ExtendedAddition(5, 10);
        int result = obj.addThreeNumbers(15);
        System.out.println("Result: " + result);
    }
}
