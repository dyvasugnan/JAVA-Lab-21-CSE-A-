package javaclass;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.JTableHeader;
import java.util.*;

public class TabfromFile extends JFrame{
	
		JTable tab;
		TabfromFile(){
			Vector<Vector> data = new Vector<Vector>();
			Vector<String> col = new Vector<String>();
			try{
				FileReader f = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Adarsha\\src\\javaclass\\Details.txt");
				
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
			tab.setGridColor(Color.pink);
			tab.setBackground(Color.gray);
			c.add("Center",tab);
			c.add("North",head);
//			c.setBackground(Color.gray);
		}
		public static void main(String[] args) {
			TabfromFile td = new TabfromFile();
			td.setSize(400,200);
			td.setVisible(true);
			//td.setBackground(Color.gray);
			td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}