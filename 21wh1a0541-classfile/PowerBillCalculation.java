package javaprograms;
abstract class PowerBill {
    final int units;
    PowerBill(int units) {
        this.units = units;
    }
    abstract void calculateBill();
}
class Domestic extends PowerBill {
    double d_rate = 0.50;
    Domestic(int units) {
        super(units);
    }
    void calculateBill() {
    	System.out.println("Domestic bill");
        double res = units * d_rate;
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + res);
    }
}
class Commercial extends PowerBill {
    double c_rate = 0.85;
    Commercial(int units) {
        super(units);
    }
    void calculateBill() {
    	System.out.println("Commercial");
        double res = units * c_rate;
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + res);
    }
}
public class PowerBillCalculation {
    public static void main(String[] args) {
        Domestic d = new Domestic(500);
        d.calculateBill();
        Commercial c = new Commercial( 900);
        c.calculateBill();
    }
}