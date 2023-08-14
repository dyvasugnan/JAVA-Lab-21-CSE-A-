import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp,count = 0;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count ++;
                }
            }
        }
        System.out.print("Array elements after sorting \n");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
        System.out.println("Number of swaps : "+count);
    }
}
