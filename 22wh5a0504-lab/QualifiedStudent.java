package javalab;
import java.util.*;

public class QualifiedStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int large = 0;
		for(int i = 0; i < b.length; i++)
		{
			if(large < a[i] && b[i] == 1)
				large = a[i];
			if(b[i] == 1)
				count++;
			
		}
		if(count > 0)
			System.out.print("Highest marks:" + large);
		else
			System.out.print("-1");
	}

}
