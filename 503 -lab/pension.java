import java.lang.*;
import java.util.*;
class pensions{
       public static void main(string args[]);
       int test,odi,mofm,ipl,india;
       int amount;
       Scanner sc = new Scanner(system.in);
       System.out.println(" Enter the no of test matches: ");
       test = sc.nextInt();
       System.out.println(" Enter the no of odi matches: ");
       odi = sc.nextInt();
      System.out,println("enter 1 if played of india else 0");
       india = sc.nextInt();
       System.out.println(" enter 1 if recives man of the match");
       momf = sc.nextInt ();
       if(odi >= 100 && test >=10){
       amount 50000;
       }
       else if(test >=10){
       amount 15000;
       }
       else if(odi >=100){
       amount 15000;
       }
       else if(india ==1 ){
       amount 10000;
       }
       else if(india >==0 && ipl = 1){
       amount 8000;
       }
       else{
       amount = 7000;
       }
       for(int i = 0; i<mofm;i++){
       amount += amount / 4;
       }
       System.out.println(amount = + amount);
       }
       }

