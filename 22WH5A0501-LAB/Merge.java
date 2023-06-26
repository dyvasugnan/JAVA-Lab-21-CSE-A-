import java.util.*;
class Merge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //char s3[]=new char[100];
        String s3="";
        for(int i=0;i<s1.length() || i<s2.length();i++){
            if(i<s1.length())
                s3=s3+s1.charAt(i);
            if(i<s2.length())
                s3=s3+s2.charAt(i);
        }
        System.out.println(s3);
    }
}
