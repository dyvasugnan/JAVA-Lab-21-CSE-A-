import java.util.*;

class Stringcompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-- >0)
        {
            int count = 1;
            String s = sc.next();
            int n= s.length();
            for(int i=0; i<n; i++)
            {
                if(i<n-1 && s.charAt(i) == s.charAt(i+1))
                    count++;
                else{
                    System.out.print(s.charAt(i));
                    System.out.print(count);
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
