package javaclasswork;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Vector;
public class Table extends JFrame {
	JTable tab;
	Table(){
		Vector<Vector> data = new Vector<Vector>();
		Vector<String> row = new Vector<String>();
		row.add("1");
		row.add("abcd");
		row.add("20000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("2");
		row.add("strp");
		row.add("10000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("3");
		row.add("strp");
		row.add("10000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("4");
		row.add("plmp");
		row.add("7000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("5");
		row.add("alam");
		row.add("8000");
		data.add(row);
		Vector<String> columns = new Vector<String>();
		columns.add("emp id");
		columns.add("emo name");
	    columns.add("Emp sal");
	    tab = new JTable(data,columns);
	    JTableHeader head = tab.getTableHeader();
	    Container c = getContentPane();
	    c.setLayout(new BorderLayout());
	    tab.setRowHeight(30);
	    tab.setGridColor(Color.PINK);
	    c.add("North",head);
	    c.add("Center",tab);
	}
	public static void main(String args[]) {
		Table tab = new Table();
		tab.setTitle("Table");
		tab.setSize(200,400);
		tab.setVisible(true);
		tab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	