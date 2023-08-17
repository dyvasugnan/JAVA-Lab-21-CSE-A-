package javalab;

class PowOf2 {
    public static void main(String[] args) {
        PowOf2 p = new PowOf2();
        if (p.isPowerOfTwo(5))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int i = 0;
        while (Math.pow(2, i) <= n) {
            if (Math.pow(2, i) == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
