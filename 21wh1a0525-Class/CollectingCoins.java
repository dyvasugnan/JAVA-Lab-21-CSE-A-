import java.util.*;
class CollectingCoins 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0)
        {
            List<Integer> v = new ArrayList<>();
            for (int i = 0; i < 4; i++) 
            {
                int x = scanner.nextInt();
                v.add(x);
            }
            int ele = Collections.max(v);
            int l = 0;
            for (int i = 0; i < 3; i++)
              {
                if (v.get(i) != ele) {
                    l += ele - v.get(i);
                }
            }
            v.set(3, v.get(3) - l);
            if (v.get(3) % 3 == 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
