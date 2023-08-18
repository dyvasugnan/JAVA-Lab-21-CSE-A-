import java.util.Scanner;  

public class ArmstrongNumber {  
    public static void  main(String args[]){     
        int n;   
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter number: ");  
        n=sc.nextInt();  
        
        int temp, digits=0, last=0, sum=0;   
        temp=n;   
        
        while(temp>0){   
        temp = temp/10;   
        digits++;   
        }   
        temp = n; 

        while(temp>0){   
        last = temp % 10;   

        //sum +=  (Math.pow(last, digits));
        int prod=1;
        for(int i=0;i<digits;i++){
            prod *= last;
        }
        sum += prod;

        temp = temp/10;   
        }  
        
        if(n==sum)   
        System.out.print("Armstrong ");      
        else    
        System.out.print("Not Armstrong "); 

    }   
}  