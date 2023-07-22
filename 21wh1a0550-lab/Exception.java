package javaclasswork;

public class Exception {
	public static void main(String args[]) {
		try
		{
		int x,y,z;
		x=10;
		y=10;
		z = x/(x-y);
		int a[] = new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			a[20] = 15;
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero Error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("ArrayIndexOfBound");
		}
		finally
		{
			System.out.println("close");
		}
			
		}
}
