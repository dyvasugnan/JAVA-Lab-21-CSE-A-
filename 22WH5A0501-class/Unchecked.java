class Check {
    int age;
    Check(int age){
        this.age=age;
    }
    void vote(){
        if(age<18)
            throw new ArithmeticException("not eligible to vote");
        else
            System.out.println("eligible to vote");
    }
}
class Unchecked{
    public static void main(String args[]){
        Check ch=new Check(19);
        ch.vote();
    }
}
