import java.lang.*;
import java.util.*;
class Player
{
    public static void main(String args[])
    {
    int salary;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of matches played: ");
        int matches=sc.nextInt();
        System.out.println("Enter the number of odi played: ");
        int odi=sc.nextInt();
        System.out.println("Enter 'y' if plaed for india or enter 'n' :");
        String played_india=sc.next();
        System.out.println("Enter how many man of the matches the player got : ");
        int man_of_match=sc.nextInt();
        System.out.println("played for ipl or not:");
        String played_for_ipl=sc.next();
        if(matches>10 && odi>100)
        {
            salary=500000;
            System.out.println("50000");
        }
        else if(matches>10)
        {
            salary=25000;
            System.out.print("25000");
        }
        else if(odi>100)
        {
            salary=15000;
            System.out.print("15000");
        }
        else if(played_india=="yes")
        {
            salary=10000;
            System.out.print("10000");
        }
        else if(played_india=="no" && played_for_ipl=="yes")
        {
            salary=8000;
            System.out.print("8000");
        }
        else
        {
            System.out.print("7000");
            salary =7000;
        }

        double final_salary=salary+(0.25*man_of_match*salary);
        System.out.print(final_salary);
    }
}
