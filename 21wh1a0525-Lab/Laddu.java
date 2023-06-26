package javalab;

import java.util.Scanner;

public class Laddu
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int flag = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[flag] == a[j])
				{
					a[j] = 0;
				}
			}
		}
		
		int max = n/2, count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				count += 1;
			}
		}
		if(count>max)
			System.out.println(max);
		else
			System.out.println(count);

		sc.close();
	}

}
