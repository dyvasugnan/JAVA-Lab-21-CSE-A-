import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener{
    JLabel id, name, year, branch, section, proname, lang;
    JTextField idField, nameField, yearField, branchField, secField, projectField, langField;
    JButton submit, cancel;
    JPanel formPanel;
    StudentPage studentPage;
    Form(StudentPage sp)
    {
        id = new JLabel("ID");
        name = new JLabel("Name");
        year = new JLabel("Year");
        branch = new JLabel("Branch");
        section = new JLabel("Section");
        proname = new JLabel("Project Name");
        lang = new JLabel("Language Used");
        idField = new JTextField();
        nameField = new JTextField();
        yearField = new JTextField();
        branchField = new JTextField();
        secField = new JTextField();
        projectField = new JTextField();
        langField = new JTextField();
        submit = new JButton("Submit");
        cancel = new JButton("Cancel");

        formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 5, 2, 5); 
        gbc.weightx = 1.0;

        formPanel.add(id, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(idField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 1;
        formPanel.add(name, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(nameField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 2;
        formPanel.add(year, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(yearField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 3;
        formPanel.add(branch, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(branchField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 4;
        formPanel.add(section, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(secField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 5;
        formPanel.add(proname, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(projectField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridy = 6;
        formPanel.add(lang, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(langField, gbc);
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        //gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submit, gbc);
        gbc.gridx = 1;
        formPanel.add(cancel,gbc);

        add(formPanel);
        submit.addActionListener(this);
        cancel.addActionListener(this);
        studentPage = sp;
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        String Id = idField.getText();
        String Name = nameField.getText();
        String Year = yearField.getText();
        String Sec = secField.getText();
        String Branch = branchField.getText();
        String Pro = projectField.getText();
        String Lang = langField.getText();
        if(str.equals("Submit"))
        {
            studentPage.addDataToTable(Id, Name, Year, Branch, Sec, Pro, Lang);
            this.dispose();
        }
        else
        {
            this.dispose();
        }
    }

    public static void main(String[] args) {
        /*  
        Form jf = new Form();
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
    }
}
