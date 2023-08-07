import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.io.*;

public class FileRead extends JFrame
{
	JTable tab;
	FileRead(){
		Vector<Vector>data = new Vector<Vector>();
        Vector<String>cols = new Vector<String>();
		cols.add("ID");
		cols.add("Name");
		cols.add("Salary");

		try
        {
            FileReader fr = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\JavaFolder\\file.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str = br.readLine())!= null)
            {
                String[] a = new String[3];
                a = str.split(",");
                Vector<String>row = new Vector<String>();
                for(String s: a)
                {
                    row.add(s);
                }
                data.add(row);
            }
        }
        catch(IOException e)
        {
			e.printStackTrace();
		}

		tab = new JTable(data,cols);

		JTableHeader head = tab.getTableHeader();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		tab.setRowHeight(30);
		tab.setGridColor(Color.blue);
		c.add("Center",tab);
		c.add("North",head);
	}
	public static void main(String[] args) 
    {
		FileRead fr = new FileRead();
        fr.setTitle("FromFileIntoTable");
		fr.setSize(400,  400);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
