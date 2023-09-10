import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int i = m + 1, j = arr.size() - 1;
        while (i < j)
        {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            int element = scanner.nextInt();
            arrayList.add(element);
        }
        
        System.out.print("Enter the index (m) to reverse the array from (0-based index): ");
        int m = scanner.nextInt();
        
        if (m >= 0 && m < arrayList.size() - 1)
        {
            reverseArray(arrayList, m);
            System.out.println("Array after reversal: " + arrayList);
        }
        else
        {
            System.out.println("Invalid index (m). The index should be between 0 and " + (arrayList.size() - 2));
        }
    }
}
