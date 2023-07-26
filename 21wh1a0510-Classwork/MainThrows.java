class MainThrows {
    public static void main(String[] args)
    {
        int a = 10, b = 0, result;
        try {
            result = a / (b);
            System.out.println("result" + result);
        }
 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is an exception");
        }
 
        finally {
            System.out.println("execution completed");
        }
    }
}
