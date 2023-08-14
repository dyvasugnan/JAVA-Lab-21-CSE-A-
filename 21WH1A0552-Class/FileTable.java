
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
public class FileTable extends JFrame{
	FileTable(){
		Vector<Vector> col = new Vector<Vector>();
		Vector<String>row = new Vector<String>();
		Container c = getContentPane();
		row.add("Name");
		row.add("Id");
		row.add("Sal");
		c.setLayout(new BorderLayout());
		JTable tab = new JTable(col,row); 
		JTableHeader head = tab.getTableHeader();
		tab.setRowHeight(50);
		tab.setGridColor(Color.black);
		c.add("Center",tab);
		c.add("North",head);
		try{
			FileReader f = new FileReader("File.txt");
			BufferedReader br = new BufferedReader(f);
			String line;
			while((line=br.readLine()) != null){
				Vector<String>row1 = new Vector<String>();
				StringTokenizer st1 = new StringTokenizer(line,",");
				row1.add(st1.nextToken().trim());
				row1.add(st1.nextToken().trim());
				row1.add(st1.nextToken().trim());
				row1.add(st1.nextToken().trim());
				col.add(row1);
			
			}
		}
		
		catch(IOException e){
			System.out.println("Error");
		}
		
		
	}
	public static void main(String args[]) {
		FileTable tf = new FileTable();
		tf.setSize(600,600);
		tf.setVisible(true);
		tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}