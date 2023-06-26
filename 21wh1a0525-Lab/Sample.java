package javalab;

import java.util.Scanner;

public class Sample
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
			int count = 0;
			int flag = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[flag] == a[j])
				{
					a[j] = 0;
					count++;
				}
			}
			if(count!=0)
			{
				a[flag] = 0;
			}
		}
		//max
		int max = a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		if(max!=0)
		System.out.println(max);
		else
		System.out.println("-1");
		
		sc.close();
	}
}
