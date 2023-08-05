import java.util.*;

public class SubArrays 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();        
        while (t-- > 0) 
        {
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = scanner.nextLong();
            }            
            long res = subArrays(a, n, x);
            System.out.println(res);
        }
    }

    public static long subArrays(long[] a, int n, long k)
    {
        long res = 0, sum = 0;
        Map<Long, Long> m = new HashMap<>();
        
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
            
            if (sum == k)
            {
                res++;
            }
            
            if (m.containsKey(sum - k))
            {
                res += m.get(sum - k);
            }
            
            m.put(sum, m.getOrDefault(sum, 0L) + 1);
        }
        
        return res;
    }
}
