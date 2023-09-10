import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class FacultyPage extends JFrame implements ActionListener{
    String jdbcUrl = "jdbc:mysql://localhost:3306/ProjectManagement";
    String username = "root";
    String password = "1234";

    JMenuBar filter;
    JMenu year, branch, lang, cse, ece, it;
    JMenuItem eee, aiml, csea, cseb, csec, ita, itb, ecea, eceb, java, python, clang, cpp, js, html, two1, two2, two3, two4;
    JPanel jp, filterPanel;
    JTable table;
    JButton logout;
    DefaultTableModel tableModel;
    FacultyPage()
    {
        filter = new JMenuBar();
        year = new JMenu("Year");
        branch = new JMenu("Branch");
        lang = new JMenu("Language");
        cse = new JMenu("CSE");
        ece = new JMenu("ECE");
        eee = new JMenuItem("EEE");
        it = new JMenu("IT");
        aiml = new JMenuItem("AIML"); 
        csea = new JMenuItem("A Section");
        cseb = new JMenuItem("B Section");
        csec = new JMenuItem("C Section");

        ita = new JMenuItem("A Section");
        itb = new JMenuItem("B Section");
        ecea = new JMenuItem("A Section");
        eceb = new JMenuItem("B Section");

        java = new JMenuItem("Java");
        python = new JMenuItem("Python");
        clang = new JMenuItem("C");
        cpp = new JMenuItem("C++");
        js = new JMenuItem("JavaScript");
        html = new JMenuItem("HTML");
        two1 = new JMenuItem("1st Year");
        two2 = new JMenuItem("2nd Year");
        two3 = new JMenuItem("3rd Year");
        two4 = new JMenuItem("4th Year");
        
        logout = new JButton("Logout");
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
            
        jp = new JPanel(new BorderLayout());
        filterPanel = new JPanel(new FlowLayout()) ;
        filterPanel.add(year);
        filterPanel.add(branch);
        filterPanel.add(lang);   
        jp.add(filter, BorderLayout.NORTH);
        
        jp.add(logout, BorderLayout.SOUTH);
        filter.setLayout(new FlowLayout());
        filter.add(year);
        filter.add(branch);
        filter.add(lang);
        year.add(two1);
        year.add(two2);
        year.add(two3);
        year.add(two4);
        branch.add(cse);
        branch.add(ece);
        branch.add(eee);
        branch.add(it);
        branch.add(aiml);
        lang.add(java);
        lang.add(python);
        lang.add(clang);
        lang.add(cpp);
        lang.add(js);
        lang.add(html);
        cse.add(csea);
        cse.add(cseb);
        cse.add(csec);
        ece.add(ecea);
        ece.add(eceb);
        it.add(ita);
        it.add(itb);
        add(jp);
        two1.addActionListener(this);
        two2.addActionListener(this);
        two3.addActionListener(this);
        two4.addActionListener(this);
        csea.addActionListener(this);
        cseb.addActionListener(this);
        csec.addActionListener(this);
        ecea.addActionListener(this);
        eceb.addActionListener(this);
        ita.addActionListener(this);
        ita.addActionListener(this);
        eee.addActionListener(this);
        aiml.addActionListener(this);
        java.addActionListener(this);
        python.addActionListener(this);
        clang.addActionListener(this);
        cpp.addActionListener(this);
        js.addActionListener(this);
        html.addActionListener(this);
        logout.addActionListener(this);
    }

    public static void main(String[] args) {
        /*FacultyPage fp = new FacultyPage();
        fp.setSize(800, 800);
        fp.setVisible(true);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String sql;

            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
            }
            tableModel.setColumnCount(0);
            if (two1.isArmed()) {
                sql = "select * from project_data where year = ?";
            } else if (two2.isArmed()) {
                sql = "select * from project_data where year = ?";
            } else if (two3.isArmed()) {
                sql = "select * from project_data where year = ?";
            } else if (two4.isArmed()) {
                sql = "select * from project_data where year = ?";
            } else if (csea.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (cseb.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (csec.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (ecea.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (eceb.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (ita.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (itb.isArmed()) {
                sql = "select * from project_data where branch = ? and section = ?";
            } else if (eee.isArmed()) {
                sql = "select * from project_data where branch = ?";
            } else if (aiml.isArmed()) {
                sql = "select * from project_data where branch = ?";
            } else if (java.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else if (python.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else if (clang.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else if (cpp.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else if (js.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else if (html.isArmed()) {
                sql = "select * from project_data where language_used = ?";
            } else {
                // Default SQL query if no filter is selected
                sql = "select * from project_data";
            }

            PreparedStatement ps = connection.prepareStatement(sql);

            if (two1.isArmed()) {
                ps.setString(1, "1");
            } else if (two2.isArmed() || two3.isArmed()) {
                ps.setString(1, "2");
            } else if (two4.isArmed()) {
                ps.setString(1, "3");
            } else if (csea.isArmed()){
                ps.setString(1, "cse");
                ps.setString(2, "a");
            } else if (cseb.isArmed()){
                ps.setString(1, "cse");
                ps.setString(2, "b");
            } else if (ecea.isArmed()){
                ps.setString(1, "ece");
                ps.setString(2, "a");
            } else if (eceb.isArmed()){
                ps.setString(1, "ece");
                ps.setString(2, "b");
            } else if (ita.isArmed()){
                ps.setString(1, "it");
                ps.setString(2, "a");
            } else if (itb.isArmed()){
                ps.setString(1, "it");
                ps.setString(2, "b");
            } else if (eee.isArmed())
            {
                ps.setString(1, "eee");
            } else if(aiml.isArmed()) {
                ps.setString(1,"aiml");
            } else if (java.isArmed() || python.isArmed() || clang.isArmed() || cpp.isArmed() || js.isArmed() || html.isArmed()) {
                ps.setString(1, e.getActionCommand().toLowerCase());
            }

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmeta = rs.getMetaData();
            int count = rsmeta.getColumnCount();

            for (int i = 1; i <= count; i++) {
                tableModel.addColumn(rsmeta.getColumnName(i));
            }

            while (rs.next()) {
                Object[] rowData = new Object[count];
                for (int i = 1; i <= count; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            table = new JTable(tableModel);
            
            jp.add(new JScrollPane(table), BorderLayout.CENTER);
            //jp.add(new JScrollPane(table), BorderLayout.CENTER); 
            //jp.add("Center", table);
            //jp.revalidate();
            table.repaint();
            
        }
        catch(SQLException sqle)
        {
            sqle.printStackTrace();
        }
        if(e.getSource() == logout)
        {
            this.dispose();
        }
    }
}
