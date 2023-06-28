import java.util.*;

class IsPalindrome {
    public static void main(String[] args) {      
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.next();
    /*  String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2 += s1.charAt(i);
        }      
        if (s1.equals(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    */
           int flag =0;
            for(int i=0;i<s1.length()/2;i++){
                if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
                    flag =1 ; break;
                }
            }
            if(flag ==1 )
             System.out.println("Not Palindrome");
            else
            System.out.println("palindrome");
    }
}
