package java21541;	
	class BubbleSort { 	
		   public static void main(String[] args) 
		   { 		
		      int[] arr = { 7, 3, 5, 1, 6, 2, 4,8,9,10 }; 		
		      
		      for (int i = 0; i < arr.length; i++) 
		      { 			
		         for (int j = 0; j < arr.length -i - 1; j++) 
		         { 				
		            if (arr[j] > arr[j + 1]) { 					
		               int temp   = arr[j]; 					
		               arr[j]     = arr[j + 1]; 					
		               arr[j + 1] = temp; 				
		            } 			
		         } 		
		      } 		
		      for (int i : arr){			
		         System.out.print(i + " ");
		   }
		}