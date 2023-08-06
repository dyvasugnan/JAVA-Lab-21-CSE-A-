package moulikaLab;

import java.util.*;

public class RailCompartment {
	public static void main(String [] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter size: ");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("enter elements itno array: ");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	int c=0,max=0;
	for(int j=1;j<n;j++)
	{
		if(a[j]-a[j-1]==1) {
			c++;
			if(c>max)
				max=c;
		}
		else 
			c=0;		
		}
	System.out.print(max+1);
	}

}