package javalab;
import java.util.*;
public class Mcq{
	public static void main(String[] args) {
		System.out.println("Number of students: ");
		Scanner sc = new Scanner(System.in);
        int count,maxa=-1;
        int n = sc.nextInt();
        System.out.println("Enter "+n+" marks: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count =0;
            for(int j=0;j<n;j++){
                if(i!=j && a[i]==a[j]){
                    count = 1;
                    break;
                }
            }
        if(count!=1){
            maxa=Math.max(maxa,a[i]);
        }}
        if(maxa==-1)
        System.out.println(maxa+" "+"no unique");
        else
        System.out.println("The max not repeated marks is: "+maxa);

    }}