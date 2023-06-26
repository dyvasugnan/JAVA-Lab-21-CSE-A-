package javalab;

public class TopperClass {
	public static void main(String[] args) {
		int []arr = new int[]{1, 2, 3, 1, 2, 3, 4, 4, 5, 6, 7};
	      int [] cnt = new int [arr.length];  
	        int maxi = -1;
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i + 1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;
	                }  
	            }  
	            if(cnt[i] != -1)  
	                cnt[i] = count;  
	        }
	        for(int i = 0; i < cnt.length; i++) {
	        	if(cnt[i] == 1) {
	        		maxi = Math.max(maxi, arr[i]);
	        	}
	        }
		   System.out.println(maxi);
}
}
