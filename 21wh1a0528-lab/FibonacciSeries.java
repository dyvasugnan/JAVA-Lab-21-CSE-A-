import java.util.*;

class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n>0){
        int n1=0,n2=1,next;
        System.out.print(n1+" "+n2+" ");
        for(int i=3;i<=n;i++){
            next = n1+n2;
            System.out.print(next+" ");
            n1=n2;
            n2=next;
        }
        }
        else{
            System.out.print("-1");
        }
        System.out.println("");
    }
}