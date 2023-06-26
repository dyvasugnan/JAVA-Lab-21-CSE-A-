package javalab;

import java.util.Arrays;

public class TrainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[] {1, 3, 4, 5, 11, 10};
		Arrays.sort(arr);
		int count = 0, ans = -1;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] + 1 == arr[i + 1]) {
				count++;
			}
			else {
				count = 0;
			}
			ans = Math.max(count, ans);
		}
		System.out.println(ans);

	}

}
