package inheritance;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.JTableHeader;
public class SwingTableTest extends JFrame{
    JTable tab;
    SwingTableTest(){
        Vector<Vector> data=new Vector<Vector>();
        Vector<String> row=new Vector<String>();
        row.add("201");
        row.add("Sony");
        row.add("10000");
        data.add(row);
        row=new Vector<String>();
        row.add("202");
        row.add("Deepthi");
        row.add("50000");
        data.add(row);
        row=new Vector<String>();
        row.add("204");
        row.add("Sruthi");
        row.add("40000");
        data.add(row);
        Vector<String> clmn=new Vector<String>();
        clmn.add("emp id");
        clmn.add("name");
        clmn.add("salary");
        tab=new JTable(data,clmn);
        JTableHeader h=tab.getTableHeader();
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        tab.setRowHeight(35);
        tab.setGridColor(Color.RED);
        c.add("North",h);
        c.add("Center",tab);
    }
    public static void main(String[] args) {
        SwingTableTest tt=new SwingTableTest();
        tt.setTitle("table demo");
        tt.setSize(400,400);
        tt.setVisible(true);
        tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}