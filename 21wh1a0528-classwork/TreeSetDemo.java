
import java.util.*;

public class TreeSetDemo {
	public static void main(String args[]) {
		
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('Z');
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		al.add('F');
		TreeSet<Character> ts1 = new TreeSet<Character>(al); //	ts1 = [A, B, C, D, E, F, Z]
		
		TreeSet<Character> ts2 = new TreeSet<Character>();
		ts2.add('B');
		ts2.add('D');
		ts2.add('F');
		ts2.add('X');         //	ts2 = [B, D, F, X]
		
		System.out.println("Set 1 size : "+ts1.size()+"    Set 2 size : "+ts2.size()); 
		
		System.out.println(ts1.containsAll(ts2)); //	false
		
		System.out.println(ts2.contains('X')); //	true
		
		ts2.remove('X');  //	ts2 = [B,D,F]
		
		System.out.println(ts1.containsAll(ts2)); //	true
		
		System.out.println(ts1.first()); //	A
		
		System.out.println(ts1.last()); //	Z
		
		System.out.println(ts1.pollFirst()); //	A  // ts1 = [B, C, D, E, F, Z]
		
		System.out.println(ts1.pollLast()); //	Z  // ts2 = [B, D, F] 
		
		System.out.println(ts1.subSet('B', 'E')); //	[B, C, D]
		
		System.out.println(ts1.subSet('B',false ,'E',true)); //	[C, D, E]
		
		System.out.println(ts1.headSet('D')); //		[B, C]
		
		System.out.println(ts1.headSet('D',true));//	[B, C, D]
		
		System.out.println(ts1.tailSet('D')); //	[D, E, F]
		
		System.out.println(ts1.tailSet('D',false));//	[E, F]
		
		System.out.println(ts1); //		[B, C, D, E, F]
		
		System.out.println(ts2); //		[B, D, F]
		
		ts1.clear(); //	ts1 = []
		
		ts2.clear(); //	ts2 = []
        
		}
	
}
