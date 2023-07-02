import java.util.* ;
import java.io.*; 
class RotateArrayLeft {
	public static void shiftOnce(int a[])
	{
		int first = a[0];
		for(int i=0; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		a[a.length - 1] = first;
	}
	public static void rotateArray(int a[], int k)
	{
		if(k>0 && k<a.length)
		{
			for(int i=1; i<=k; i++)
			{
				shiftOnce(a);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // array size
		int[] a = new int[n]; //array declaration
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		int k = sc.nextInt(); // input of number of times to rotate left
		rotateArray(a, k);
		
		for(int i: a)
		System.out.print(i + " ");
		System.out.println();
	}
}
