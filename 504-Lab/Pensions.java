import java.util.*;
import java.io.*;
class Pensions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of testmatches played: ");
        int a = sc.nextInt(); //testmatches
        System.out.println("Enter no.of odi player played: ");
        int b = sc.nextInt(); //odi
        System.out.println("If he played for india enter 1 else 0");
        int d = sc.nextInt();
        System.out.println("If he played for ipl enter 1 else 0");
        int e = sc.nextInt();
        int f=0;
        if(a>10 && b>100)
            f = 50000;
        else if(a<10 && b>100)
            f = 25000;
        else if(a>10 && b>100)
            f = 15000;
        else if(d==1)
            f = 10000;
        else if(d==0 && e==1)
            f = 8000;
        else if(d==0 && e==1)
            f = 7000;
        System.out.println("Enter the no.of man of matches received : ");
        int c = sc.nextInt();
        for(int i=1; i<=c; i++){
            f+=f/4;
        }
        System.out.println(f);
    }
}


            

