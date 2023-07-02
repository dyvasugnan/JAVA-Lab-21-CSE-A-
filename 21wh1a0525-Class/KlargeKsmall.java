import java.util.*;

class KlargeKsmall
{
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
		ArrayList<Integer> a = new ArrayList<Integer>();
		int small = arr.get(k-1);
		a.add(small);
		int large = arr.get(arr.size()-k);
		a.add(large);
		return a;
	}
    
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int num = sc.nextInt();
			arr.add(num);
		}
		ArrayList<Integer> res = kthSmallLarge(arr, n, k);
		for(int i=0; i<res.size(); i++)
		{
			System.out.print(res.get(i) + " ");
		}
		System.out.println();
	}
}
