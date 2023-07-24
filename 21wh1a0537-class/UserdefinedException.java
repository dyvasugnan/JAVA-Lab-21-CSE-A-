import java.util.*;
public class UserdefinedException extends Exception{
    
        
        MyException(String str){
            Super(str);
        }
        public static void main(String[] args) {
            int accno[]={1,2,3};
            double bal[]={5000,10000,20000};
            try{
                for(int i=0;i<3;i++){
                    System.out.println(accno[i] +" "+bal[i]);
                if(bal[i]<5000){
                    MyException e=new MyException("Min balance ");
                    throw e;
                }              
              }
            }
            catch(MyException e){
                System.out.println(e);
            }
        }

        
    
}