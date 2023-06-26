package javalab;
import java.util.*;

public class Laddus {
	public static void main(String args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		int count = 0;
		int b[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(a[i] == a[j])
					count++;
			}
			b[i] = count;
			count = 0;
		}
		int c[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			if(b[i] == 1)
				c[i] = a[i];
			else
				c[i] = 0;
		}

	}

}
