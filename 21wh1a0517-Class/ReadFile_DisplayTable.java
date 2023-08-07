package javalab;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

public class ReadFile_DisplayTable extends JFrame {
    JTable tab;
    ReadFile_DisplayTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("ID");
        model.addColumn("Salary");

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Renukumar\\Pictures\\kushi\\Java_programs\\21wh1a0517java\\src\\swing.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                model.addRow(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        tab = new JTable(model);
        tab.setRowHeight(50);
        tab.setGridColor(Color.black);

        JTableHeader head = tab.getTableHeader();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add("Center", tab);
        c.add("North", head);
    }
    public static void main(String[] args) {
    	ReadFile_DisplayTable rf_dt = new ReadFile_DisplayTable();
        rf_dt.setSize(400, 400);
        rf_dt.setVisible(true);
        rf_dt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}