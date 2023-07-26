import java.util.*;
import java.io.*;

abstract class PowerBill
{
    double rate;
    double units;
    abstract void getRate();
    void calculateBill()
    {
        System.out.println(rate);
    }
}

class Domestic extends PowerBill
{
    void getRate()
    {
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();
        rate = units * 5;
    }
}

class Commercial extends PowerBill
{
    void getRate()
    {
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();
        rate = units * 10;
    }
}

class AbstractClass
{
    public static void main(String args[])
    {
        Domestic d = new Domestic();
        d.getRate();
        d.calculateBill();
        Commercial c = new Commercial();
        c.getRate();
        c.calculateBill();
    }
}
