import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class GetData{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Vector<Vector> data = new Vector<Vector>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String line;
            
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ");
                Vector<String> row = new Vector<String>();
                
                while (st.hasMoreTokens()) {
                    row.add(st.nextToken());
                }

                data.add(row);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        Vector<String> col = new Vector<String>();
        col.add("ID");
        col.add("NAME");
        JTable jt = new JTable(data,col);
        JTableHeader head = jt.getTableHeader();
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add("North", head);
        jp.add("Center", jt);
        jf.add(jp);
        jf.setSize(400,400);
        jf.setVisible(true);
    }
}
