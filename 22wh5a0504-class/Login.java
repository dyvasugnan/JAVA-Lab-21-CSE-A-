import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener{

    String jdbcUrl = "jdbc:mysql://localhost:3306/ProjectManagement";
    String username = "root";
    String password = "1234";

    JPanel stud_pan, faculty_pan;
    JTextField stud_id, faculty_id;
    JPasswordField stud_pass, faculty_pass;
    JLabel stud_id_label, stud_pass_label, faculty_id_label, faculty_pass_label;
    JButton submitStud, submitFac;
    Container c1;
    JTabbedPane tabbedPane;
    Login()
    {
        tabbedPane = new JTabbedPane();

        stud_pan = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        stud_id = new JTextField(20);
        stud_pass = new JPasswordField(20);
        stud_id_label = new JLabel("Username:");
        stud_pass_label = new JLabel("Password:");
        submitStud = new JButton("LogIn");

        gbc.gridx = 0;
        gbc.gridy = 0;
        stud_pan.add(stud_id_label, gbc);
        gbc.gridx = 1;
        stud_pan.add(stud_id, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        stud_pan.add(stud_pass_label, gbc);
        gbc.gridx = 1;
        stud_pan.add(stud_pass, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        stud_pan.add(submitStud, gbc);

        tabbedPane.addTab("Student Login", stud_pan);

        faculty_pan = new JPanel(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(5, 5, 5, 5);

        faculty_id = new JTextField(20);
        faculty_pass = new JPasswordField(20);
        faculty_id_label = new JLabel("Username:");
        faculty_pass_label = new JLabel("Password:");
        submitFac = new JButton("LogIn");

        gbc1.gridx = 0;
        gbc1.gridy = 0;
        faculty_pan.add(faculty_id_label, gbc1);
        gbc1.gridx = 1;
        faculty_pan.add(faculty_id, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 1;
        faculty_pan.add(faculty_pass_label, gbc1);
        gbc1.gridx = 1;
        faculty_pan.add(faculty_pass, gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 2;
        gbc1.gridwidth = 2;
        faculty_pan.add(submitFac, gbc1);

        tabbedPane.addTab("Faculty Login", faculty_pan);

        add(tabbedPane);
        submitStud.addActionListener(this);
        submitFac.addActionListener(this);
    }
    public static void main(String[] args) {
        Login jlogin = new Login();
        jlogin.setSize(800, 800);
        jlogin.setVisible(true);
        jlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitStud)
        {
            char[] pword = stud_pass.getPassword();
            String upassword = String.valueOf(pword);
            String uname = stud_id.getText();
            try{
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                String sql = "select password from stud_logins where username = ?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    if((rs.getString("password")).equals(upassword))
                    {
                        StudentPage f = new StudentPage();
                        f.setSize(800, 800);
                        f.setVisible(true);
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        stud_id.setText("");
                        stud_pass.setText("");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Wrong Password");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Wrong Username");
                }
            }
            catch(SQLException sqle)
            {
                sqle.printStackTrace();   
            }
        }
        else
        {
            char[] pword = faculty_pass.getPassword();
            String upassword = String.valueOf(pword);
            String uname = faculty_id.getText();
            try{
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                String sql = "select password from faculty_logins where username = ?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    if((rs.getString("password")).equals(upassword))
                    {
                        FacultyPage f = new FacultyPage();
                        f.setSize(800, 800);
                        f.setVisible(true);
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        faculty_id.setText("");
                        faculty_pass.setText("");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Wrong Password");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Wrong Username");
                }
            }
            catch(SQLException sqle)
            {
                sqle.printStackTrace();   
            }
        }
    }
}
