import java.util.*;

public class RomanDecimalConverter {
    static HashMap<String, Integer> romanToDecimal = new HashMap<>();
    static TreeMap<Integer, String> decimalToRoman = new TreeMap<>();

    public static void main(String[] args) {
        initializeMappings();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String[] inp = sc.nextLine().split(" ");
            if (inp[0].equals("1")) {
                int n = Integer.parseInt(inp[1]);
                String res = decimalToRoman(n);
                System.out.println(res);
            } else {
                String s = inp[1];
                int res = romanToDecimal(s);
                System.out.println(res);
            }
        }
    }

    public static void initializeMappings() {
        romanToDecimal.put("I", 1);
        romanToDecimal.put("IV", 4);
        romanToDecimal.put("V", 5);
        romanToDecimal.put("IX", 9);
        romanToDecimal.put("X", 10);
        romanToDecimal.put("XL", 40);
        romanToDecimal.put("L", 50);
        romanToDecimal.put("XC", 90);
        romanToDecimal.put("C", 100);
        romanToDecimal.put("CD", 400);
        romanToDecimal.put("D", 500);
        romanToDecimal.put("CM", 900);
        romanToDecimal.put("M", 1000);

        decimalToRoman.put(1, "I");
        decimalToRoman.put(4, "IV");
        decimalToRoman.put(5, "V");
        decimalToRoman.put(9, "IX");
        decimalToRoman.put(10, "X");
        decimalToRoman.put(40, "XL");
        decimalToRoman.put(50, "L");
        decimalToRoman.put(90, "XC");
        decimalToRoman.put(100, "C");
        decimalToRoman.put(400, "CD");
        decimalToRoman.put(500, "D");
        decimalToRoman.put(900, "CM");
        decimalToRoman.put(1000, "M");
    }

    public static String decimalToRoman(int n) {
        StringBuilder res = new StringBuilder();
        for (int value : decimalToRoman.descendingKeySet()) {
            while (n >= value) {
                res.append(decimalToRoman.get(value));
                n -= value;
            }
        }
        return res.toString();
    }

    public static int romanToDecimal(String s) {
        int res = 0;
        int c = 0;
        while (c < s.length()) {
            if (c + 1 < s.length() && romanToDecimal.containsKey(s.substring(c, c + 2))) {
                res += romanToDecimal.get(s.substring(c, c + 2));
                c += 2;
            } else {
                res += romanToDecimal.get(String.valueOf(s.charAt(c)));
                c++;
            }
        }
        return res;
    }
}
