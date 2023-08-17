package practice;
import java.lang.*;
import java.util.*;
class BubbleSort{
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array : ");
      int num = sc.nextInt();
      int arr[] = new int[num];
      System.out.println("Enter elements into array: ");
      for(int i = 0;i < num;i++) arr[i] = sc.nextInt();
      System.out.println("Sorted Array: ");
      int swaps = 0;
      for(int i =0;i < num-1;i++){
                 for(int j =0;j < num-i-1;j++){
                     if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swaps += 1;
                       }
                  }
           }
     for(int i =0;i < num;i++) System.out.println(arr[i]+" ");
     System.out.println("Total swaps : "+swaps);
  
  }
}