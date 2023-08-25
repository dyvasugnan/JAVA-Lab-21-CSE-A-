import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        Double n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        m = sc.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        Double hypo = Math.sqrt(n*n + m*m);
        System.out.print(decimalFormat.format(hypo));
    }
}
