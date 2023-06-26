package javalab;
import java.util.*;
import java.lang.*;
public class Topper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int cnt[] = new int[n];
		int i, k, j;
		int maxi = 100009;
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
				else {
					k = arr[i];
					for(i = 0; i < n; i++) {
						cnt[i] = k;
					}
				}
			}
		}
		if(cnt.length < 1) {
			System.out.println(-1);
		}
		else {
		for(i = 0; i < n; i++) {
			maxi = cnt[0];
			maxi = Math.max(maxi, cnt[i]);
		}
			System.out.println(maxi);
		}
}
}
