import java.util.*;

public class TreesetImp {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(81);
        ts.add(31);
        ts.add(99);
        ts.add(45);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);
        al.add(31);
        al.add(45);
        al.add(81);
        Integer a[] = {31,2,45,34};
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(a));
        System.out.println("ts contains all elements of al: " + ts.containsAll(al));
        System.out.println("ts contains all elements of al2: " + ts.containsAll(al2));
        System.out.println(ts.subSet(31, 99));
        System.out.println(ts.subSet(31, false, 99, true));
        System.out.println(ts.headSet(81));
        System.out.println(ts.headSet(81, false));
        System.out.println(ts.tailSet(31));
        System.out.println(ts.tailSet(31,false));
        System.out.println("PollFirst\n" + "Returned and deleted element: " + ts.pollFirst());
        System.out.println("PollLast\n" + "Returned and deleted element: " + ts.pollLast());
        System.out.println("First element of ts: " + ts.first());
        System.out.println("Last element of ts: " + ts.last());
        
    }
}
