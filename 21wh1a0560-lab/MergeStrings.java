import java.util.*;

class MergeStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        StringBuilder mergedString = new StringBuilder();
        s1 = sc.next();
        s2 = sc.next();
        int l1,l2;
        l1 = s1.length();
        l2 = s2.length();   
        for(int i=0;i<Math.min(l1,l2);i++) {
            mergedString.append(s1.charAt(i));
            mergedString.append(s2.charAt(i));
        }
        if(l1 > l2){
            mergedString.append(s1.substring(l2));
        }   
        else
            mergedString.append(s2.substring(l1));
        System.out.println("\n\nMerged string of "+s1+" and "+s2+" is : "+mergedString);
    }
}