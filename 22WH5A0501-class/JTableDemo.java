import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.JTableHeader;
public class JTableDemo extends JFrame{
    JTable tab;
    JTableDemo(){
        Vector<Vector> data=new Vector<Vector>();
        Vector<String> row=new Vector<String>();
        row.add("501");
        row.add("Sirisha");
        row.add("1000000");
        data.add(row);
        row=new Vector<String>();
        row.add("504");
        row.add("Deepika");
        row.add("500000");
        data.add(row);
        row=new Vector<String>();
        row.add("505");
        row.add("Priya");
        row.add("400000");
        data.add(row);
        Vector<String> clmn=new Vector<String>();
        clmn.add("emp id");
        clmn.add("name");
        clmn.add("salary");
        tab=new JTable(data,clmn);
        JTableHeader h=tab.getTableHeader();
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        tab.setRowHeight(20);
        tab.setGridColor(Color.GREEN);
        c.add("North",h);
        c.add("Center",tab);
    }
    public static void main(String[] args) {
        JTableDemo td=new JTableDemo();
        td.setTitle("table demo");
        td.setSize(400,400);
        td.setVisible(true);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}