package javalab;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.*;
import java.util.*;

public class TableData extends JFrame{
	JTable tab;
	TableData(){
		Vector<Vector>data = new Vector<Vector>();
		Vector<String>row = new Vector<String>();
		
		row.add("123");
		row.add("abc");
		row.add("1000");
		data.add(row);
		row = new Vector<String>();
		row.add("1234");
		row.add("abcd");
		row.add("3000");
		data.add(row);
		row = new Vector<String>();
		row.add("12345");
		row.add("abcde");
		row.add("80000");
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
		tab.setGridColor(Color.black);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) {
		TableData td = new TableData();
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
	