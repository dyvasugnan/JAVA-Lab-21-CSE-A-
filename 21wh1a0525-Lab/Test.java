package javalab;
import java.util.*;

public class Test {
	public static void main(String[] args)
	{
		int N,count=1;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		int i;
		for(i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			   for(int j=1;j<N;j++)
			   {
				   if(a[i]==a[j])
				   {
					   count=count+1;
				   }
			   }
			   if(count==1)
			   {
				   b[i]=a[i];
			   }
		}
		int max=b[0];
		for(int k=0;k<N;k++)
		{
			if(max<b[k])
			{ 
				max=b[k];
				
			}
		}
		System.out.println(max);
		
	}


}
