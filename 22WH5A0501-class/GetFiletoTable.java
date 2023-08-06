import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
public class GetFiletoTable extends JFrame{
    JTable tab;
    GetFiletoTable(){
        Vector<Vector<String>> data=new Vector<>();
        Vector<String> clmn=new Vector<>();
        try{
            String path="C:\\Users\\aavul\\OneDrive\\Desktop\\java programs\\textfile.txt";
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line;
            boolean firstline=true;
            while((line=br.readLine())!=null){
                String parts[]=line.split(",");
                if(firstline){
                    for(String p:parts)
                        clmn.add(p);
                    firstline=false;
                }else{
                    Vector<String> row=new Vector<>();
                    for(String p:parts)
                        row.add(p);
                    data.add(row);
                }
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        tab=new JTable(data,clmn);
        JTableHeader h=tab.getTableHeader();
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        tab.setRowHeight(20);
        tab.setGridColor(Color.PINK);
        c.add("North",h);
        c.add("Center",tab);
    }
    public static void main(String[] args) {
        GetFiletoTable td=new GetFiletoTable();
        td.setTitle("table with info from file");
        td.setSize(400,400);
        td.setVisible(true);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
