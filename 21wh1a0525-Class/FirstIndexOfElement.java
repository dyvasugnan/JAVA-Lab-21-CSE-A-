//find the index of a number at its first occurance
import java.util.*;
class Solution
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//array size
		int[] a = new int[n];
		for(int i=0; i<n; i++)// array elements
		{
			a[i] = sc.nextInt();
		}
		int x = sc.nextInt();//element to search
		int count = 0;
		for(int i=0; i<n; i++)
		{
			if(a[i] == x)
			{
				count = 1;
				System.out.println(i);
				break;
			}
		}
		if(count == 0)
		System.out.println("-1");
	}
}
