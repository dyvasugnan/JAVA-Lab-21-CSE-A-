import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.*;

public class TableDemo extends JFrame{
	JTable tab;
	TableDemo(){
		Vector<Vector>data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();
		
		row.add("111");
		row.add("aaa");
		row.add("1000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("222");
		row.add("bbb");
		row.add("2000");
		data.add(row);
		
		row = new Vector<String>();
		row.add("333");
		row.add("ccc");
		row.add("3000");
		data.add(row);
		
		Vector<String>columns= new Vector<String>();
		columns.add("ID");
		columns.add("Name");
		columns.add("Salary");
	 
		tab = new JTable(data,columns);
		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		 
		tab.setRowHeight(50);
		tab.setGridColor(Color.green);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) {
		TableDemo td = new TableDemo();
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
