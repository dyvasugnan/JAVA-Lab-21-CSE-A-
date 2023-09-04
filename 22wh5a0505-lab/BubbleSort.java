import java.util.*;
class BubbleSort{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter number of size: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
}
		int count=0;
		int i,j,temp;
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
					}
				}
			}
		System.out.println("Array before sort: ");
		for (int k=0;k<arr.length;k++){
			System.out.println(arr[k]+" ");
		}
		System.out.println();
		System.out.println("Array after Sorting: ");
		for(int l=0;l<arr.length;l++){
			System.out.println(arr[l]+" ");
		}
System.out.println("no of swaps: "+count);
}
}
			
