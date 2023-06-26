
import java.util.*;


class Cricket{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            int nt=0,no=0,IPL=0,mm=0;

            System.out.println("Enter testMatches, ODI , IPL , man_of_match awards");

            nt = sc.nextInt();
            no = sc.nextInt();

            IPL = sc.nextInt();

            mm = sc.nextInt();
            
            int amount = 0;

            if(nt>10 && no>100){
                amount = 50000;
            }else if(nt>10){
                amount = 25000;
            }else if(no >100){
                amount = 15000;
            }else if (nt!=0 || no!=0){
                amount = 10000;
            }else if(IPL !=0){
                amount = 8000;
            }else{
                amount = 7000;
            }
            
            int new_amount = amount;
            if(mm != 0){
                while(mm>0){
                   new_amount += (new_amount/4);
                   mm--;
                   }
            }
            System.out.println(new_amount);
    }
}


