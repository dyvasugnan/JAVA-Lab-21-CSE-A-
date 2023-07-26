class Testthrow {
public static void main(String[] args){
    try{
        throw new ArithmeticException("test on mainthrow");
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    finally{
        System.out.println("Execution completed");
    }
}
}
