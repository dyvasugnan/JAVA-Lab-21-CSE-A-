package javaclss;
import java.util.Scanner;

public class BankAcc {
    Scanner sc = new Scanner(System.in);

    void CI(int r) {
        String pd = sc.next();
        if (pd.equals("anusha123")) {
            Inner in = new Inner();
            in.CalcInterest(r);
        } else {
            System.out.print("Invalid Password");
        }
    }

    class Inner {
        void CalcInterest(int r) {
            int p = 2000;
            int t = 2;
            System.out.print("Interest: " + (p * t * r));
        }
    }

    public static void main(String[] args) {
        BankAcc b = new BankAcc();
        b.CI(0);
    }
}

