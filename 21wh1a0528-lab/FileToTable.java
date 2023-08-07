
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.util.*;

public class FileToTable extends JFrame{
	JTable tab;
	FileToTable()throws Exception{
		Vector<Vector> data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();

    /*   row.add("111");
        row.add("James");
        row.add("10080");
        data.add(row);

        row = new Vector<String>();
        row.add("113");
        row.add("Oliver");
        row.add("10300");
        data.add(row);

        row = new Vector<String>();
        row.add("115");
        row.add("John");
        row.add("10800");
        data.add(row);a
*/
		
		FileInputStream fis = new FileInputStream("Sample.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line;
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            row = new Vector<String>();
            for (int i = 0; i < 3; i++)
                row.add(info[i]);
            data.add(row);
        }
		
		Vector<String> col = new Vector<String>();				
		col.add("ID");
		col.add("Name");
		col.add("Salary");

		tab = new JTable(data,col);

		JTableHeader head = tab.getTableHeader();		
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		tab.setRowHeight(30);

		c.add("Center",tab);
        c.add("North",head);
		
		
	}
	public static void main(String[] args) throws Exception{
		FileToTable td = new FileToTable();
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
