import java.lang.*;
import java.util.*;
class Bubblesort
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n-j-1;k++)
            {
                if(arr[k]>arr[k+1]){
                    int a=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=a;}
            }
        }
        for(int a=0;a<n;a++)
            System.out.print(arr[a]);
    }
}


