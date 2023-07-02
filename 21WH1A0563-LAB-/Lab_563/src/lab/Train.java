package lab;
import java.util.*;
public class Train {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		
		int max=1, longest = 0;
		
		for(int i=0;i<n-1;i++)
		{
			if((a[i]+1) == a[i+1])
			{
				max++;
			}
			else
			{
				max = 1;
			}
			if(max>longest)
			{
				longest = max;
			}
		}
		System.out.println(longest);
		sc.close();
	}
}
