package javaclass;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.JTableHeader;
import java.util.*;

public class File extends JFrame{
	JTable tab;
	File(){
		Vector<Vector> data = new Vector<Vector>();
		Vector<String>col = new Vector<String>();
		try{
		FileReader f = new FileReader("C:\\Users\\vnave\\eclipse-workspace\\Java\\empinfo.txt.txt");
		BufferedReader br = new BufferedReader(f);
		String line;
		while((line=br.readLine()) != null){
			String  arr[] = new String[3];
			arr = line.split(",");
			Vector<String>row = new Vector<String>();

			for(String x : arr){
				row.add(x);
			}
			data.add(new Vector<>(Arrays.asList(arr)));
		}
	}
		catch(IOException e){
			e.printStackTrace();
		}
		col.add("Emp ID");
		col.add("Emp Name");
		col.add("Emp Salary");

		tab = new JTable(data,col);

		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		tab.setRowHeight(30);
		tab.setGridColor(Color.BLACK);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) {
		File td = new File();
		td.setTitle("Table");
		td.setSize(500,500);
		td.setVisible(true);
		td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
