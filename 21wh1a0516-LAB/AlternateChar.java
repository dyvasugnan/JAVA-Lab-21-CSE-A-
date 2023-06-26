import java.util.*;

class AlternateChar{
    public static void main(String args[]){
            
            String s1,s2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter s1 and s2");

            s1 = sc.nextLine();
            s2 = sc.nextLine();

            String s3 = s1 + s2;

            System.out.println("Appended string "+s3);

            int len1 = s1.length();
            int len2 = s2.length();

            int i = 0, j = 0;
            
            String s4="";
            int k=0;
            while(i < len1 && j <len2){
                s4 = s4 + s1.charAt(i) + s2.charAt(j);
                i++;
                j++;
            }

            while(i<len1){
                s4 = s4 + s1.charAt(i);
                i++;
            }

            while(j<len2){
                s4 = s4 + s2.charAt(j);
                j++;
            }

            System.out.println("Alternate STring  "+s4);
        }
}
                
