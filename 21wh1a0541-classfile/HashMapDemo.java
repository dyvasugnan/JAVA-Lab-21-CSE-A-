package javagui3;

import java.util.HashMap;
import java.util.Scanner;
public class HashMapDemo {
	  public static void main(String[] args) {
	        HashMap<Integer,String> hm = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        int ele;
	        do {
	            System.out.println("HashMap Implementation:");
	            System.out.println("1.put key value pair:");
	            System.out.println("2.get key value pair");
	            System.out.println("3.remove key value pair");
	            System.out.println("4.Check if key exists");
	            System.out.println("5.Print HashMap");
	            System.out.println("6.Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();    
	            int k;
	            String v;
	            switch(ch){
	                case 1:
	                    System.out.print("Enter key as int : ");
	                    k = sc.nextInt();
	                    System.out.print("Enter Value as string: ");
	                    v = sc.next();hm.put(k, v);
	                    break;                   
	                case 2:
	                    System.out.print("Enter key to get value : ");
	                    k = sc.nextInt();
	                    String s = hm.get(k);
	                    System.out.println("value of key : "+ " " + k +" "+ "is" + s);
	                    break;                  
	                case 3:
	                    System.out.print("Enter key  to remove: ");
	                    k = sc.nextInt();
	                    hm.remove(k);
	                    break; 
	                case 4:
	                	System.out.println("Enter key to check (exists)"); 
	                	k = sc.nextInt();
	                	boolean e = hm.containsKey(k);
	                	System.out.println("keys exists: " + e);
	                	break;
	                case 5:
	                    System.out.println("HashSet Elements are: " + hm);
	                    break;                   
	                case 6:
	                    System.out.println("Exit");
	                    break;                   
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }  
	        } while(true);
	        }
	}