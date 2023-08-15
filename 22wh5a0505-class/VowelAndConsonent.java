
import java.util.*;
public class VowelAndConsonent
{
    
    public static void main (String[]args)
    {
        ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int vowel =0, consonant= 0;
        System.out.println("Java program to count vowel and consonant");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a String");
        String str = sc.nextLine(); 
        for(int i = 0; i < str.length(); i++){
            if(arr.contains(str.charAt(i))) {        
                vowel++;    
            }    
            else if((str.charAt(i) >= 'a' && str.charAt(i)<='z') || (str.charAt(i) >= 'A' && str.charAt(i)<='Z')) {      
                consonant++;    
            }   
        }    
        System.out.println("Vowel= "+vowel+", Consonant ="+consonant);
    }
}