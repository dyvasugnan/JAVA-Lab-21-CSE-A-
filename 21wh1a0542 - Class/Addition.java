import java.util.Scanner;
public class Add {

    public static void main(String[] args) {
        
        int x,y,add;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        x = s.nextInt();
        
        System.out.println("Enter the value of b : ");
        y = s.nextInt();
        
        s.close();
        add = x+y;
        System.out.println("Sum : "+add);
    }
}