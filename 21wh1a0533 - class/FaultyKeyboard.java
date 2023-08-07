import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "your_input_string_here";
        String result = solution.finalString(input);
        System.out.println(result);
    }
}

class Solution {
    public String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                res.reverse();
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
