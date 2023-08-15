import java.util.*;
class Swaps
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int swap = 0;
		for(int i=0; i<n-1; i++)
		{
		    for(int j=0; j<n-i-1; j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            int t = a[j];
		            a[j] = a[j+1];
		            a[j+1] = t;
		            swap++;
		        }
		    }
		}
		for(int i=0; i<n; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n" + swap);
	}
}
