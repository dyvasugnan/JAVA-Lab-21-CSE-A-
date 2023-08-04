package SWINGS;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.util.*;
import java.lang.*;

public class TableDemo extends JFrame {
	JTable tab;
	TableDemo(){
		Vector<Vector>data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();

		row.add("101");
		row.add("Ashwitha");
		row.add("5000");
		data.add(row);
		row = new Vector<String>();
		row.add("102");
		row.add("Sanj");
		row.add("10000");
		data.add(row);
		Vector<String>cols = new Vector<String>();
		cols.add("ID");
		cols.add("Name");
		cols.add("Salary");

		tab = new JTable(data,cols);

		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		tab.setRowHeight(30);
		tab.setGridColor(Color.yellow);
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
