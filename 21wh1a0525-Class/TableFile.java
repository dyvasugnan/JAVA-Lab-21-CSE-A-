import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;

public class TableFile extends JFrame
{
	JTable tab;
	TableFile(){
		Vector<Vector>data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();

        Vector<String>cols = new Vector<String>();
		cols.add("ID");
		cols.add("Name");
		cols.add("Salary");

		row.add("101");
		row.add("Shivani");
		row.add("5000");
		data.add(row);

		row = new Vector<String>();
		row.add("102");
		row.add("Bhavani");
		row.add("10000");
		data.add(row);

		tab = new JTable(data,cols);

		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		tab.setRowHeight(30);
		tab.setGridColor(Color.blue);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) 
    {
		TableFile td = new TableFile();
        td.setTitle("IntoTable");
		td.setSize(400,  400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
