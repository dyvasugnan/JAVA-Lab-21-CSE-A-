package classprogram;
import java.util.*;
public class InsertionSort {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i = 0;i<n;i++)
		a[i] = sc.nextInt();
	int i,j,key;
	for(i=1;i<n;i++){
		
	key=a[i];
	for(j=i-1;j>=0;j--){
	if(a[j]>key)
	a[j+1]=a[j];
	else
	break;
	}
	a[j+1]=key;
	}
	for(i = 0;i<n;i++)
		System.out.print(a[i]);
}
}
