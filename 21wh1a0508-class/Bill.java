abstract class PowerBill {
    double rate;
    abstract void getRate();
    void calculate(double units) {       
        double bill= rate * units;
        System.out.println("Bill : " + bill);
    }
}

class Domestic extends PowerBill {
    void getRate() {
        rate = 0.15; 
    }
}

class Commercial extends PowerBill {
    void getRate() {
        rate = 2.0; 
    }
}

public class Bill {
    public static void main(String args[]) {
        Domestic d = new Domestic();
        d.getRate();
        d.calculate(90);

        Commercial c = new Commercial();
        c.getRate();
        c.calculate(250);
    }
}
