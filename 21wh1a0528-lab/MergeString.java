import java.util.Scanner;
class MergeString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1 = sc.nextLine();
        s2= sc.nextLine();
        String s3 = "";
        int l1 = s1.length(),l2=s2.length();
        int  i =0;
        while (i<l1 && i <l2){
            s3 += s1.charAt(i);
            s3 += s2.charAt(i);
            i++;
        }
        while(i<l1){
            s3 += s1.charAt(i);
            i++;
        }
        while(i<l2){
            s3 += s2.charAt(i);
            i++;
        }
        System.out.println(s3);
    }
}