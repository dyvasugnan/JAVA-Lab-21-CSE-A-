package lab;
import java.util.*;

public class Train {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int long_seq = 0;
		int curr_seq = 1;
		for(int i=1;i<a.length;i++){
			if(a[i]!=a[i-1]){
				if(a[i]== a[i-1]+1){
					curr_seq++;
				}
				else{
					curr_seq = 1;
				}
				long_seq = Math.max(long_seq,curr_seq);
			}
	}
	System.out.println(long_seq);
	}
}
