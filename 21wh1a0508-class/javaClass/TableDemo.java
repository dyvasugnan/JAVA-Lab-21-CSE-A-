package javaClass;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.*;
import java.util.*;

public class TableDemo extends JFrame{
	JTable tab;
	TableDemo(){
		Vector<Vector>data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();
		
		row.add("508");
		row.add("Udayasri");
		row.add("50000");
		data.add(row);
		row = new Vector<String>();
		row.add("509");
		row.add("ammu");
		row.add("8000");
		data.add(row);
		row = new Vector<String>();
		row.add("510");
		row.add("jannu");
		row.add("60400");
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
		tab.setGridColor(Color.cyan);
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
	