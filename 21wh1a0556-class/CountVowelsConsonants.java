import java.util.*;
public class CountVowelsConsonants{
    public static void main(String[] args) {
        String str;
        Scanner sc =new Scanner(System.in);
        str=sc.next();
        int vcount = 0, ccount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                vcount++; 
                
            } 
            else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
    }
}
