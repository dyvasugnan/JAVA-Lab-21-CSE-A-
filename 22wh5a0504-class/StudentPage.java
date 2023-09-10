import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StudentPage extends JFrame implements ActionListener{
    String jdbcUrl = "jdbc:mysql://localhost:3306/ProjectManagement";
    String username = "root";
    String password = "1234";

    JTable table;
    JButton buttonadd, buttonBack;
    JPanel jp, buttonPanel;
    JScrollPane scrollPane;
    StudentPage studentPage;
    StudentPage()
    {
        try{
            buttonadd = new JButton("Add Project");
            buttonBack = new JButton("Logout");
            jp = new JPanel();
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "SELECT * FROM project_data";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData rsmeta = rs.getMetaData();
            int count = rsmeta.getColumnCount();
            DefaultTableModel tableModel = new DefaultTableModel();
            for (int i = 1; i <= count; i++) {
                tableModel.addColumn(rsmeta.getColumnName(i));
            }
            while(rs.next())
            {
                Object[] rowData = new Object[count];
                for (int i = 1; i <= count; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            table = new JTable(tableModel);
            buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(buttonadd);
            buttonPanel.add(Box.createRigidArea(new Dimension(1000, 0)));
            buttonPanel.add(buttonBack);
            jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
            scrollPane = new JScrollPane(table);
            jp.add(scrollPane);
            jp.add(buttonPanel);
            add(jp);
            buttonadd.addActionListener(this);
            buttonBack.addActionListener(this);
            studentPage = this;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void addDataToTable(String i,String n, String y, String b, String s, String p, String l) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Vector<String> row = new Vector<String>();
        row.add(i);
        row.add(n);
        row.add(y);
        row.add(b);
        row.add(s);
        row.add(p);
        row.add(l);
        model.addRow(row);
        addToDatabase(i, n, y, b, s, p, l);
    }

    public void addToDatabase(String id, String name, String year, String branch, String section, String projectName, String languageUsed) {
        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Define the SQL insert statement
            String sql = "INSERT INTO project_data (id, name, year, branch, section, project_name, language_used) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set parameter values
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, year);
            preparedStatement.setString(4, branch);
            preparedStatement.setString(5, section);
            preparedStatement.setString(6, projectName);
            preparedStatement.setString(7, languageUsed);

            // Execute the insert statement
            preparedStatement.executeUpdate();
            // Close the prepared statement and connection
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*StudentPage f = new StudentPage();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String str = e.getActionCommand();
        if(str == "Add Project")
        {
            Form jf = new Form(StudentPage.this);
            jf.setSize(600, 600);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        else
        {
            this.dispose();
        }
    }

}
