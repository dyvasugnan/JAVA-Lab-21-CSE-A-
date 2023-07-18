// In many jurisdictions a small deposit is added to drink containers to encourage people to recycle them. In one particular jurisdiction, drink containers holding one liter or less have a 0.10 dollar deposit, and drink containers holding more than one liter have a 0.25 dollar deposit. Write a program that reads the number of containers of each size from the user and compute the refund that will be received for returning those containers
import java.util.*;
class BottleDeposits{
    public static void main(String args[]){
        int less1Ltr , more1Ltr;
        Scanner sc = new Scanner(System.in);
        less1Ltr = sc.nextInt();
        more1Ltr = sc.nextInt();
        float paying = less1Ltr*0.1f + more1Ltr*0.25f;
        System.out.println("total paying : $"+paying);
    }
}