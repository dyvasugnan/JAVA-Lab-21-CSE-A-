
import java.util.*;  
public class ReversingArray
{
	public static void main(String[] args) {
		int startIndex,lastIndex;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }
        startIndex = 0;
        lastIndex = size - 1;
         while (startIndex < lastIndex)
        {
            arr[startIndex] = arr[startIndex] + arr[lastIndex];
            arr[lastIndex] = arr[startIndex]- arr[lastIndex];
            arr[startIndex] = arr[startIndex]- arr[lastIndex];
            startIndex++;
            lastIndex--;
        }
        System.out.println("Array After Reversing :");
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
	}
}