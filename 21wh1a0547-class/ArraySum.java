import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int num[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum +num[i];
        }
            System.out.println(sum);
    }
}
