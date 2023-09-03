import java.io.Serializable;
import java.util.Calendar;

public class Cal extends Object implements Serializable, Cloneable {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date & Time: " + c.getTime());
        c.add(Calendar.DATE, -15);
        System.out.println("15 days before: " + c.getTime());
        c.add(Calendar.MONTH, 3);
        System.out.println("3 months after: " + c.getTime());
        c.add(Calendar.YEAR, -1);
        System.out.println("1 year ago: " + c.getTime());
    }
}
