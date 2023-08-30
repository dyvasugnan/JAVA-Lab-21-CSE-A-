
import java.util.*;


public class SetsDemo {

	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(2);
		al.add(2);
		al.add(4);
		al.add(11);
		al.add(28);
		al.add(18);
		Set<Integer> s1 = new HashSet<Integer>(al);
	  
		for(int i:s1)
			System.out.print(i+" ");
		System.out.println();
		
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(2);
		s2.add(6);
		s2.add(4);
		s2.add(8);
		
		Iterator it = s2.iterator();
        while (it.hasNext()) 
            System.out.print(it.next()+" ");
        System.out.println();
		
		
		Integer[] arr = {1, 2, 3, 4, 5};
		Set<Integer> s3 = new HashSet<Integer>(Arrays.asList(arr));
		s3.forEach(ele -> System.out.print(ele + " "));
		System.out.println();

		Set<Integer> UnionSet = new HashSet<Integer>(s1);
		UnionSet.addAll(s2);
		UnionSet.addAll(s3);
		
		System.out.println(UnionSet); // union of s1 , s2 ,s3
		
		
		Set<Integer> IntersectSet = new HashSet<Integer>(s1);
		IntersectSet.retainAll(s2);
		System.out.println(IntersectSet); // intersection of s1 and s2
		
		Set<Integer> DifferenceSet = new HashSet<Integer>(s1);
		DifferenceSet.removeAll(s3); // s1 - s3
		System.out.println(DifferenceSet);
		
		
	}
	
}
