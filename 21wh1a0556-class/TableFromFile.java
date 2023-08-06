import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.io.*;

public class JTableFile extends JFrame {
    JTable tab;
    JTableFile() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Salary");

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91944\\Desktop\\swing.txt"))) {
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
        JTableFile td = new JTableFile();
        td.setSize(400, 400);
        td.setVisible(true);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
