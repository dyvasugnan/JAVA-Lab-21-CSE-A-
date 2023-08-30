package classprogram;
import java.util.*;
public class TargrtSum {
	boolean find(Vector <Integer>v,int t) {
		for(int i = 0;i<v.size();i++) {
			int diff =t- v.get(i);
			if(v.contains(diff)&&diff!=v.get(i))
				return true;
		}
		return false;
	}
public static void main(String args[]) {
	TargrtSum obj = new TargrtSum();
	Vector <Integer>v = new Vector<Integer>();
	Scanner sc = new Scanner(System.in);
	System .out.print("Enter the size of the vector");
	int n = sc.nextInt();
	int ele;
	for(int i = 0;i<n;i++)
	{
		ele = sc.nextInt();
		v.add(ele);
	}
	System.out.print("Enter the target");
	int t = sc.nextInt();
	if(obj.find(v,t))
		System.out.print("yes");
	else
		System.out.print("no");
}
}
