package javagui3;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int ele;
        do {
            System.out.println("HashSet:");
            System.out.println("1.Add Element");
            System.out.println("2.Remove Element");
            System.out.println("3.Check if Element Exists");
            System.out.println("4.Print HashSet");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();           
            switch(ch){
                case 1:
                    System.out.print("Enter element to add: ");
                    ele = sc.nextInt();
                    hs.add(ele);
                    break;                   
                case 2:
                    System.out.print("Enter element to remove: ");
                    ele = sc.nextInt();
                    hs.remove(ele);
                    break;                  
                case 3:
                    System.out.print("Enter element to check: ");
                    ele = sc.nextInt();
                    boolean exists = hs.contains(ele);
                    System.out.println("Is Element exists in HashSet??: " + exists);
                    break;  
                case 4:
                    System.out.println("HashSet Elements are: " + hs);
                    break;                   
                case 5:
                    System.out.println("Exit.");
                    break;                   
                default:
                    System.out.println("Invalid choice.");
                    break;
            }  
        } while(true);
        }
}
