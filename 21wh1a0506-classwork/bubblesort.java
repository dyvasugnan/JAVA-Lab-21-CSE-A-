import java.lang.*;
import java.util.Scanner;

class BubbleSort{
  public static void main(String args[]){
    int a[] = new int [100];
    int n,i,j,t ; 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of an array");
    n =sc.nextInt();
    System.out.print("Enter array elements : ");
    for(i = 0;i<n;i++)
      a[i] = sc.nextInt();

    for(i = 0;i<n;i++){
      for(j = 0;j<n-i-1;j++){
        if(a[j]>a[j+1]){
          t = a[j];
          a[j]= a[j+1];
          a[j+1]= t;}
      }
    }
    System.out.print("Sorted array : ");
  for(i = 0;i<n;i++)
    System.out.println(a[i]);
  }
}
