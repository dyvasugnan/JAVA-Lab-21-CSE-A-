import java.util.*;

public class SubArray 
{
    public static void subArray(ArrayList<Integer> v, int start, int end)
    {
        if (start == v.size()) 
        {
            return;
        } 
        else if (start > end)
        {
            subArray(v, 0, end + 1);
        }
        else
        {
            System.out.print("[");
            for (int i = start; i < end; i++)
            {
                System.out.print(v.get(i) + " ");
            }
            System.out.println(v.get(end) + "]");
            subArray(v, start + 1, end);
        }
        return;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            a.add(sc.nextInt());
        }
        subArray(a, 0, 0);
    }
}
