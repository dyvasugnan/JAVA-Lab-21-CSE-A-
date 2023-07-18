import java.util.*;
class Thanos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int planets = sc.nextInt();
        int population , rate , food, years = 0;
        for (int i=0;i<planets ; i++){
            population = sc.nextInt();
            rate = sc.nextInt();
            food = sc.nextInt();
            while ( food >= population ){
                years ++;
                population *= rate;
            }
        }
        System.out.print(years);
    }
}