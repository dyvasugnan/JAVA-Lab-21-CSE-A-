import java.util.*;

class This{
    int a=5;
    int b=10;
    This(int a,int b){
        this.a=a; 
        this.b=b; 
    }
    void product(){
        System.out.println("product : "+a*b);
    }
}
class ThisKeyword{
    public static void main(String args[]){
        This t = new This(2,3);
        t.product();
    }
}