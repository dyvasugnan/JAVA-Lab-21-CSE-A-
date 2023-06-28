import java.util.*;
class CricketerPension{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many test matches played:");
        int tests = sc.nextInt();
        System.out.print("How many odi matches played:");
        int odi = sc.nextInt();
        System.out.print("How many 'man of match' award:");
        int mom = sc.nextInt();
        System.out.print("Played for India(true/false):");
        boolean only_ind = sc.nextBoolean();
        System.out.print("Played for IPL(true/false):");
        boolean only_ipl = sc.nextBoolean();
   

        float amt =0.0f;

        if(only_ind)
            amt += 10000;
        else if(only_ipl)
            amt += 8000;
        else
            amt += 7000;

        if(tests>10 && odi>100)
            amt += 50000;
        else if(tests>10)
            amt += 25000;
        else if(odi>100)
            amt += 15000;

        /* for(int i=0;i<mom;i++){
            amt += (amt)/4.0;
        } */
        float ex=amt/4;   
        for(int i=0;i<mom;i++){
            amt += ex;
        }
        System.out.println(amt);

        }
}