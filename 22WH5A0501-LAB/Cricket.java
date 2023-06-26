import java.util.*;
class Cricket{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test matches");
        int tm=sc.nextInt();
        System.out.println("enter the number of ODI's played");
        int ODI=sc.nextInt();
        System.out.println("played for India enter y or n");
        char team=sc.next().charAt(0);
        System.out.println("enter the number of man of the match");
        int motm=sc.nextInt();
        System.out.println("if player played IPL then enter 1 or else 0");
        int ipl=sc.nextInt();
        int amount;
        if(tm>10 && ODI==100){
            amount=50000;
        }else if(tm>10){
            amount=25000;
        }else if(ODI>100){
            amount=15000;
        }else if(team=='y'){
            amount=10000;
        }else if(team=='n' && ipl==1){
            amount=8000;
        }else{
            amount=7000;
        }
        if(motm!=0){
            for(int i=0;i<motm;i++)
                amount += (amount*0.25);
        }
        System.out.println("total amount="+amount);
    }
}
