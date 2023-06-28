//STRING MERGE
import java.util.*;
class MergeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s2.length()>s1.length()){
            for(int i=0;i<s1.length();i++){
                System.out.print(s1.charAt(i));
                System.out.print(s2.charAt(i));
            }
            for(int j=s1.length();j<s2.length();j++)
            System.out.print(s2.charAt(j));
        }
        else{
            for(int k=0;k<s2.length();k++){
                System.out.print(s1.charAt(k));
                System.out.print(s2.charAt(k));
            }
            for(int p=s2.length();p<s1.length();p++)
            System.out.print(s1.charAt(p));
        }
    }
}
