package java_lab;
import java.util.*;
public class QuickSort1 {
	public static void sort(int a[],int low,int high) {

	if(low<high) {

	int j = partition(a,low,high);

	sort(a,low,j-1);

	sort(a,j+1,high);

	}

	}

	public static int partition(int a[],int low,int high) {

	int pivot = a[low];

	int i = low +1;

	int j = high;

	int temp;

	while(i<=j) {

	while(a[i]<=pivot && i<=j)

	i++;

	while(a[j]>pivot && i<=j)

	j--;

	if(i<j)

	{

	temp = a[i];

	a[i] = a[j];

	a[j] = temp;

	}}

	a[low] = a[j];

	a[j] = pivot;

	return j;

	}

	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter no.of elements : ");

	int n = sc.nextInt();

	int[] a = new int[n];

	for(int i=0;i<n;i++)

	a[i] = sc.nextInt();

	sort(a,0,n-1);

	for(int k=0;k<n;k++)

	System.out.println(a[k]+" ");

	}

	}