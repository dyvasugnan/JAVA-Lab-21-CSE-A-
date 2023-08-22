import java.lang.*;
import java.util.Scanner;
class QuickSort{
   public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter no.of elements: ");
          int n = sc.nextInt();
          int []arr = new int[n];
          System.out.print("Enter the elements: ");
          for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
             
 }
      quickSort(arr,0,n-1);
      System.out.print("Sorted elements: ");
  for(int num : arr){
  System.out.print(num + " ");
}
sc.close();
}

          public static void quickSort(int[] arr, int low, int high){
            if(low<high){
               int pivotIndex = partition(arr, low, high);
               quickSort(arr, low, pivotIndex-1);
               quickSort(arr, pivotIndex+1, high);
}
}
  public static int partition(int[] arr, int low, int high){
     
             int pivot = arr[high];
             int i = low-1;
             for(int j = low; j<high; j++){
                  if(arr[j]<pivot){
                        i++;
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
}
}
  int temp = arr[i+1];
  arr[i+1] = arr[high];
  arr[high] = temp;
  return i+1;
}
}