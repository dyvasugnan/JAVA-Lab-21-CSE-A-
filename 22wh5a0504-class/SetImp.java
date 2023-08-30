import java.util.*;

public class SetImp {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        Integer b[] = {3,4,5,6,7};
        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(a));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(b));
        
        Set<Integer> uset = new HashSet<>(s1);
        uset.addAll(s2);
        for(int i : uset)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

        Set<Integer> iset = new HashSet<>(s1);
        iset.retainAll(s2);
        for(int i : iset)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

        Set<Integer> dset = new HashSet<>(s1);
        dset.removeAll(s2);
        for(int i : dset)
        {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
