class MyException extends Exception {
    static int accNo[] = {101, 102, 103, 104, 105};
    static String name[] = {"raju", "rama", "ramu", "sita", "geeta"};
    static double balance[] = {1000, 2000, 500, 8000, 1200};

    MyException(String str) {
        super(str);
    }
    public static void main(String args[]) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(accNo[i] + " " + name[i] + " " + balance[i]);
                if (balance[i] < 1000) {
                    MyException me = new MyException("Minimum balance");
                    throw me;
                }
                System.out.println(); 
            }
        } catch (MyException me) {
            System.out.println(me);
        }
    }
}
