class Demo{
int n1,n2;
Demo(int a,int b){
    n1=a;
    n2=b;
}
void swap(Demo d){
    int temp;
    temp = d.n1;
    d.n1 = d.n2;
    d.n2 = temp;
}
}
public class SwapNumbers{
    public static void main(String args[]){
        Demo d = new Demo(10,20);
        System.out.println("n1 : "+d.n1+" n2 : "+d.n2);
        System.out.println("After sorting");
        d.swap(d);
        System.out.println("n1 : "+d.n1+" n2 : "+d.n2);
    }
}