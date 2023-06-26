import java.lang.*;
import java.util.*;
class Alterletters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1:");
        String s1=sc.next();
        System.out.print("enter string 2:");
        String s2=sc.next();
        String s3="";
        int i=0,j=0;
        int len1=s1.length();
        int len2=s2.length();
        while((i<len1) && (j<len2))
        {
            s3=s3+s1.charAt(i)+s2.charAt(j);
            i++;
            j++;
        }
        if(len1>len2)
        {
            int x=len1-len2-1;
            while(x<len1)
            {
                s3=s3+s1.charAt(x);
                x++;
            }
        }
        if(len2>len1)
        {
            int x=len2-len1-1;
            while(x<len2)
            {
                s3=s3+s2.charAt(x);
                x++;
            }
        }
        System.out.println("string=" + s3);
}
}
