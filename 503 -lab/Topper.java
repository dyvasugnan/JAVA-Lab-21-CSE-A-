package javalab;
public class Topper {

	public static void main(String[] args) {
          int arr[] = new int[] {1,2,3,1,2,3,4,4,5};
          int cnt[] = new int[arr.length];
          int Visited = -1;
          int flag = 0;
          int ans = -1;
          int maxi = -1;
          for(int i=0;i<arr.length;i++) {
        	  int Count = 1;
        	  for(int j = i+1;j<arr.length;j++){
        		  if(arr[i] == arr[j]) {
        			  Count++;
        		 }
        	  }
        	  if(cnt[i]!= -1);
        	  cnt[i] = Count;
        	  }
          for(int i =0;i<cnt.length;i++) {
        	  if(cnt[i] == 1) {
        		  maxi = Math.max(maxi,arr[i]);
        	  }
          }
          System.out.println(maxi);
          
	}

}
