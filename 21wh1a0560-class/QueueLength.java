/*
Input Format

First line has two numbers N and Q - representing size of grid and number of queries respectively.

Next Q lines has Q queries, one per line. Each query consists of two integers x, y denoting the coordinates of the counter C and is independent of each other, for the given grid.
*/
import java.util.*;
class QueueLength{
    public static void main(String[] args){
        int grid,queries;
        Scanner sc = new Scanner(System.in);
        grid = sc.nextInt();
        queries = sc.nextInt();
        int x[] = new int[queries];
        int y[] = new int[queries];
        for(int i=0;i<queries;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i=0;i<queries;i++){
            if(x[i]%2 != 0)
                System.out.println((grid*x[i] + grid-y[i] -1)+"\n");
            else
                System.out.println((grid*x[i]+y[i])+"\n");
        }
    }
}
