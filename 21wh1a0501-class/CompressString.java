
import java.util.*;

class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int count = 1;
            String s = sc.next();
            int n= s.length();
            for(int i=0; i<n; i++)
            {
                if(i<n-1 && s.charAt(i) == s.charAt(i+1))
                {
                    count++;
                }
                else
                {
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
