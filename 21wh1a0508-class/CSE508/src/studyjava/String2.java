package studyjava;

public class String2 {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] product = new int[n1 + n2];
        
        for (int i = n1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            
            for (int j = n2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int currProduct = digit1 * digit2;
                
                int p1 = i + j; 
                int p2 = i + j + 1;
                int sum = currProduct + product[p2];
                
                product[p1] += sum / 10; 
                product[p2] = sum % 10; 
            }
        }
        
    
        StringBuilder sb = new StringBuilder();
        for (int digit : product) {
            sb.append(digit);
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
