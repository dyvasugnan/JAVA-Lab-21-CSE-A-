import java.util.*;
import java.lang.*;
class Pension{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of test, ODI's, IPL matches, Man of the match awards: ");
        int test = sc.nextInt();
        int odi = sc.nextInt();
        int ipl = sc.nextInt();
        int aw = sc.nextInt();
        int total=0;
        if(test >= 10 && odi >= 100){
            total += 50000;
        }
        else if(test >= 10)
            total +=25000;
        else if(odi >= 100)
            total += 15000;
        else if(odi + test != 0)
            total += 10000;
        else if( test + odi == 0 && ipl != 0)
            total += 8000;
        else
            total = 7000;
        total += (aw * total * 0.25);
        System.out.println("The player recieves: "+total);
    }
}
