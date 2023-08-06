package classprogram;
import java.util.*;
public class HighStudentMarks {
public static void main(String args[]) {
	int n ;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int a[] = new int[n];
	for(int i = 0;i<n;i++)
		a[i] = sc.nextInt();
	int fre[] = new int[n];
	int k = 0;
	int count = 0;
	for(int i = 0;i<n;i++) {
		count = 0;
		for(int j = 0;j<n;j++) {
			if(a[i]==a[j])
				count++;
		}
		fre[k++] = count;
	}
	int max = 0;
    for(int i = 1;i<n;i++)
    {
    	if(fre[i]==1) {
    		if(a[i]>max)
    			max = a[i];
    	}
    }
    System.out.println(max);
}
}
