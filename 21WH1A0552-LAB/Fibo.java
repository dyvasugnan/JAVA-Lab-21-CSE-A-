import java.util.*;
class Fibo{
    public static void main(String args[]){
        int n1 = 0,n2 = 1,n3 = n1+n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int i;
        System.out.print("Fibonacci Series until nth term : "+n1+" "+n2+" ");
        for(i=0;i<n-2;i++){
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
