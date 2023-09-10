import java.io.*;
import java.util.*;

public class StringQuickSort {

    static String names[];
   

    public static void main(String[] args) throws IOException{
        StringQuickSort sqs = new StringQuickSort();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println(size);
        System.out.println("Enter the elements");
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] =sc.next();
        }
        names = words;
        sqs.quickSort(0,size-1);
          System.out.println("The sorted strings are : ");
        for (String  i : words) {
            System.out.println(i);
           
        }
    }
   

    void quickSort(int lower, int upper) {
        int lb = lower;
        int ub = upper;
        String pivot = names[lower + ( upper - lower) / 2];

        while (lb <= ub) {
            while (names[lb].compareToIgnoreCase(pivot) < 0) {
                lb++;
            }

            while (names[ub].compareToIgnoreCase(pivot) > 0) {
                ub--;
            }

            if (lb <= ub) {
                swap(lb, ub);
                lb++;
                ub--;
            }
        }
      
        if (lower < ub) {
            quickSort(lower, ub);
        }
        if (lb <  upper) {
            quickSort(lb,  upper);
        }
    }

    void swap(int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
}
