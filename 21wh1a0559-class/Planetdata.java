package javalab;
import java.util.*;
class PlanetData{
    public static void main(String args[]){
    	  Scanner sc = new Scanner(System.in);
        long population , rate , food, years = 0;
        population = sc.nextInt();
        rate = sc.nextInt();
        food = sc.nextInt();
        while ( food >= population ){
        	years ++;
        	population *= rate;
        }
        System.out.print(years);
    }
}
