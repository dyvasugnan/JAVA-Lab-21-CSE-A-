import java.math.BigInteger;
public class FrameTest {
    static BigInteger fact(int n){
        BigInteger b=new BigInteger("1");
        for(int i=2;i<=n;i++)
            b=b.multiply(BigInteger.valueOf(i));
        return b;
    }
    public static void main(String[] args)throws Exception {
        int n=20;
        System.out.print("fact of "+n+" is "+fact(n));   
    }
}
