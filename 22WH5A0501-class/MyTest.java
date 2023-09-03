import java.util.*;
class Ascend implements Comparator<Integer>{
    public int compare(Integer n1,Integer n2){
        return n1.compareTo(n2);
    }
}
public class MyTest {
    public static void main(String[] args) {
        Integer a[]={2,1,5,3};
        Arrays.sort(a,new Ascend());
        System.out.println(Arrays.toString(a));
    }
}
