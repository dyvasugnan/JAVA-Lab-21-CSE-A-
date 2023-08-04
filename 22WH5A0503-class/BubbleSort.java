package javalab;
import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=10;
        System.out.print("Enter 10 numbers : ");
        int a[]=new int[10];

        int i,j,temp;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       System.out.println("After sorting");

        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}