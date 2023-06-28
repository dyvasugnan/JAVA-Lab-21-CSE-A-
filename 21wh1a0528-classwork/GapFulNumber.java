import java.util.*;

class GapFulNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
       /* int l=0,temp1=n;
      
         while(temp1 != 0){
            temp1 /= 10;
            l++;
        }
        
        for(int i=0;i<l-1;i++){
            temp2 = temp2/10;
        } */
        
        int temp2=n;
        while(temp2 >= 10){
            temp2 /= 10;
        }
        int first=temp2;
        int last = n%10;
       
        int r=first*10+last;

        if(n%r==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}