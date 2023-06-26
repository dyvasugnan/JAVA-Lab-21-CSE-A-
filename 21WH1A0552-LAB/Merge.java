import java.util.*;
class Merge{
    public static void main(String args[]){
        System.out.print("Enter two strings : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length(), n2 = s2.length();
        int i = 0, j = 0;
        String res = "";
        while(i < n1 && j < n2){
             res = res + s1.charAt(i) + s2.charAt(j);
             i++; j++;
        }
        while(i < n1){
            res = res + s1.charAt(i); i++;
        }
        while(j < n2){
            res = res + s2.charAt(j);
            j++;
        }
        System.out.println("The merged String is : "+res);
        }
}
