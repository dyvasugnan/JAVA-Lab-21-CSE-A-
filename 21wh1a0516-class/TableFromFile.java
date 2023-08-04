package SWINGS;
import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.swing.table.*;

import javax.swing.table.JTableHeader;

import java.util.*;
public class TableFromFile extends JFrame{
	JTable tab;
	TableFromFile(){
		Vector<Vector> data = new Vector<Vector>();
		Vector<String>col = new Vector<String>();
		try{
		FileReader f = new FileReader("SWINGS\\studnames.txt");
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

			//data.add(new Vector<>(Arrays.asList(arr)));
		}
	}
		
		catch(IOException e){
			e.printStackTrace();
		}
		col.add("ID");
		col.add("Name");
		col.add("Sal");

		tab = new JTable(data,col);

		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		tab.setRowHeight(30);
		tab.setGridColor(Color.yellow);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) {
		TableFromFile td = new TableFromFile();
		td.setSize(400,400);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


