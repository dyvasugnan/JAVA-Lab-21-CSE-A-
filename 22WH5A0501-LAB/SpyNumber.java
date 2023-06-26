import java.util.*;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        int temp=n;
        while(temp!=0){
            sum+=temp%10;
            pro*=temp%10;
            temp/=10;
        }
        if(sum==pro)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
