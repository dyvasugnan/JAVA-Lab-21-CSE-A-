import java.util.*;
class Pension{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of test mactches, ODI matches,IPL matches,MOMs : ");
        int test = sc.nextInt();
        int odi = sc.nextInt();
        int ipl = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        if(test >= 10 && odi >= 100)
            sum += 50000;
        else if(test >= 10)
            sum += 25000;
        else if(odi >= 100)
            sum += 15000;
        else if(odi+test != 0)
            sum += 10000;
        if(test+odi == 0 && ipl != 0)
            sum += 8000;
        else if(ipl == 0 && test+odi == 0)
            sum += 7000;
        sum += sum*0.25*m;
        System.out.println("Amount of money cricketer gets : "+sum);
        }
}
