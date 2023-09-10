import java.util.*;
public class TargetSum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size: ");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.print("enter elements: ");
		for(int k=0;k<n;k++)
			a[k]=sc.nextInt();
		System.out.print("enter target: ");
		int t=sc.nextInt();
		int f=0,i,j,t1=-1,t2=-1;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(t==a[i]+a[j]) {
					t1=a[i];
					t2=a[j];
					f++;
				break;
				}
			}
				if(f==1)
					break;
		}
		if(t1!=-1&&t2!=-1)
		System.out.print(t1+" "+t2);
		else
			System.out.println("not found");
	}

}
