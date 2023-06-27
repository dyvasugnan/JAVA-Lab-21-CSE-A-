package java21541;
import java.util.*;
/*Chota Bheem is fond of Laddus, there are N Laddus in a
row, N is an even number.
Where k-th laddu is of type-laddu[k], 1&lt;=k&lt;=N. Due to
health issues, Chota Bheem was suggested to eat at most
N/2 Laddus of different types. He can eat only 1 Laddu of
each type. You are given an list of integers, your task is to
find the maximum number of Laddus, Chota Bheem can
eat.*/
public class Chotabheem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        System.out.print("Enter num: ");
        n = sc.nextInt();
        int i ;
        int a []= new int[n];
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        int k = 0;
        b[k] = a[0];
        k++;
        for(i =1;i<n;i++){
            int flag = 0;
            for(j = 0;j<=k;j++){
                if(a[i]==b[j]){
                flag++;
                break;
        }}
        if(flag==0){
        b[k] = a[i];
        k++;}
    }
    for(i = 0;i<k;i++)
    System.out.print(b[i]);
    if(n/2<k)
    System.out.println(n/2);
    else
    System.out.println(k);
}}
