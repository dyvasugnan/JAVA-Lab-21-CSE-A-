import java.util.*;
class AlterMerge{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        int i = 0, j = 0;
        String res = "";
        while(n1>i && n2>j){
            res = res+s1.charAt(i)+s2.charAt(j);
            i++;
            j++;
        }
        while(n1>i && n2==j){
            res = res+s1.charAt(i);
            i++;
        }
        while(n2>j && n1==i){
            res = res+s2.charAt(j);
            j++;
        }
        System.out.println("Result : " +res);
    }
}
