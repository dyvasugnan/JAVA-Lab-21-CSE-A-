import java.util.*;
class SumBT {
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long sum=0;
            while(n>=1){
                sum+=n;
                n/=2;
            }
            System.out.println(sum);
        }
    }
}
