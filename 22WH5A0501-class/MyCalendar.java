import java.util.*;
import java.io.*;
public class MyCalendar extends Object implements Serializable,Cloneable {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("Current date and time"+c.getTime());
        c.add(Calendar.DATE,-15);
        System.out.println("15 days before"+c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("2 months later"+c.getTime());
        c.add(Calendar.YEAR,3);
        System.out.println("3 years later"+c.getTime());
    }
}
