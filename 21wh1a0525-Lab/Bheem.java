package javalab;
import java.util.*;
public class Bheem {
public static void main(String args[])
{
	int N,count=1;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	int a[]=new int[N];
	for(int i=0;i<N;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(int i=0;i<N;i++)
	{
		for(int j=1;j<N;j++)
		{  
			if(a[i]==a[j])
			{
				count=count+1;
			}
		}
		if(count>=2)
		{
			flag=flag+1;
		}
		
	}
	System.out.println(flag);
}
}
