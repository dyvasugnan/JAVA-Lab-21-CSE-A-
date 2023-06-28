import java.util.*;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int s=0,p=1;
        while(temp>0){
            s += (temp%10);
            p *= (temp%10);
            temp /= 10;
        } 
        if(s==p)
            System.out.println("SPYNUMBER");
        else
            System.out.println("NOT SYPNUMBER");
    }
}