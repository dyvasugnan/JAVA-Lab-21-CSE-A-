package java_lab;
import java.util.*;
public class TrainCompartment {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++){
	a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	int coiunt = 0;
	int max = 0;
	for(int i=1;i<a.length;i++){
	if((a[i]-a[i-1])==1){
	c++;
		if(coumt>max)
			max = count;
	}
	else{
	count =0 ;
	}
	}
	System.out.println(max+1);
	}
	}


