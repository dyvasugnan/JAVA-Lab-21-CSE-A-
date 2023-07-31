//find the index of a number at its first occurance
import java.util.*;
class Solution
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int x = sc.nextInt();
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
