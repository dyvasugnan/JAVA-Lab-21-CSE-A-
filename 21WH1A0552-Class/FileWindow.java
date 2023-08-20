import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FileWindow extends JFrame{
	JTable jt;
	FileWindow(){
		Vector<Vector> data = new Vector<Vector>();
		Vector<String>col = new Vector<String>();
		FileReader f = new FileReader("File.txt");
		BufferedReader br = new BufferedReader(f);
		String line;
		while((line=br.readLine()) != null){
			String  arr[] = new String[3];
			arr = line.split(",");
			Vector<String>row = new Vector<String>();

			for(String x : arr){
				row.add(x);
			}
			data.add(row);
		}
	}
		
		col.add("Name");
		col.add("ID");
		col.add("Salary");

		tab = new JTable(data,col);

		JTableHeader head = jt.getTableHeader();
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		jt.setRowHeight(30);
		jt.setGridColor(Color.yellow);
		c.add("Center",jt);
		c.add("North",head);
	}
	public static void main(String[] args) {
		FileWindow td = new FileWindow();
		td.setSize(600,600);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}