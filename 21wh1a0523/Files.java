package labprograms;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.JTableHeader;
import java.util.*;

public class Files extends JFrame{

		JTable tab;
		Files(){
			Vector<Vector> data = new Vector<Vector>();
			Vector<String>col = new Vector<String>();
			try{
			FileReader f = new FileReader("C:\\Users\\anush\\OneDrive\\Desktop\\details.txt");
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
			col.add("Salary");

			tab = new JTable(data,col);

			JTableHeader head = tab.getTableHeader();
			Container c = getContentPane();

			c.setLayout(new BorderLayout());

			tab.setRowHeight(30);
			tab.setGridColor(Color.black);
			tab.setBackground(Color.white);
			c.add("Center",tab);
			c.add("North",head);
		}
		public static void main(String[] args) {
			Files td = new Files();
			td.setSize(400,200);
			td.setVisible(true);
			//td.setBackground(Color.gray);
			td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}
