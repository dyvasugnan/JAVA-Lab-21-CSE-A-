//given two fractions
//we need to print addition of 2 fractions or product of two fractions in simplified manner

import java.util.*;
import java.io.*;

class Fraction {
    int num, den;

    Fraction(int a, int b) {
        num = a;
        den = b;
    }

    void add(Fraction f) {
        int a = num, b = den;
        num = (a * f.den) + (b * f.num);
        den = b * f.den;
        simplify();
    }

    void multiply(Fraction f) {
        int a = num, b = den;
        num = a * f.num;
        den = b * f.den;
        simplify();
    }

    void simplify() {
        int GCD = gcd(num, den);
        num = num / GCD;
        den = den / GCD;
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    void print() {
        System.out.println(num + "/" + den);
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Fraction f1 = new Fraction(a, b);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            Fraction f2 = new Fraction(c, d);
            switch (n) {
                case 1:
                    f1.add(f2);
                    break;
                case 2:
                    f1.multiply(f2);
                    break;
            }
			f1.print();
        }
    }
}
