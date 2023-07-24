//search element in array
import java.util.*;
class SearchElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        long a[] = new long[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextLong();
        long ele = sc.nextLong();
        for(int j=0;j<n;j++){
            if(a[j]==ele)
            flag = false;

        }
        if(!flag)
        System.out.println("Element Found");
        else
        System.out.println("Element Not Found");
    }
}