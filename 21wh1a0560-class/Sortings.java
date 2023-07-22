import java.util.*;
class Sortings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        BubbleSort b = new BubbleSort();
        b.bubbleSort(a,n);
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.print("\n");
        SelectionSort ss = new SelectionSort();
        ss.selection_sort(a,n);
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");

        System.out.print("\n");
        InsertionSort is = new InsertionSort();
        is.insertion_sort(a,n);
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
class BubbleSort{
    void bubbleSort(int a[],int n){
        int i,j,t;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
} } } }

class SelectionSort{
    void selection_sort(int[] a, int n){
        int i,j,t;
        for(i=0;i<n-1;i++){
            int min = i;
            for(j=i;j<n;j++){
                if(a[j] < a[min])
                    min = j;
            }
            if(min != i){
                t = a[min];
                a[min] = a[i];
                a[i] = t;
            }
        }
    }
}

class InsertionSort{
    void insertion_sort(int a[], int n){
        int i,j,curr;
        for(i=1;i<n;i++){
            j = i-1;
            curr = a[i];
            while(a[j] > curr && j>=0){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;
        }
    }
}