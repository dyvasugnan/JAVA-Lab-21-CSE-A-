import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class SwingTable {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Table");
        jf.setSize(400, 400);
        Vector<Vector> data = new Vector<Vector>();
        Vector<String> row = new Vector<String>();
        row.add("1");
        row.add("Deepika");
        row.add("5000000");
        data.add(row);
        row = new Vector<String>();
        row.add("2");
        row.add("Seema");
        row.add("4000000");
        data.add(row);
        row = new Vector<String>();
        row.add("3");
        row.add("Sirisha");
        row.add("500000");
        data.add(row);
        row = new Vector<String>();
        row.add("4");
        row.add("Priya");
        row.add("40000");
        data.add(row);
        Vector<String> col = new Vector<String>();
        col.add("ID");
        col.add("NAME");
        col.add("SALARY");
        JTable jt = new JTable(data, col);
        JTableHeader head = jt.getTableHeader();
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add("North",head);
        jp.add("Center",jt);
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
