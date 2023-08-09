import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SwingMenu extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu f,e,h,font;
    JMenuItem op, save, exit, f1,f2, cut,copy,paste;
    JTextArea jt;
    Container c;
    SwingMenu()
    {
        mb = new JMenuBar();
        f = new JMenu("FILE");
        e = new JMenu("EDIT");
        h = new JMenu("HELP");
        font = new JMenu("Font");
        op = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        f1 = new JMenuItem("Times New Roman");
        f2 = new JMenuItem("Arial");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        jt = new JTextArea();
        c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add("North",mb);
        c.add("Center",jt);
        jt.setFont(new Font("Arial", Font.PLAIN, 16));
        mb.add(f);
        mb.add(e);
        mb.add(h);
        f.add(op);
        f.add(save);
        f.add(font);
        f.add(exit);
        e.add(cut);
        e.add(copy);
        e.add(paste);
        font.add(f1);
        font.add(f2);
        op.addActionListener(this);
        exit.addActionListener(this);
        save.addActionListener(this);
        //font.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(op.isArmed())
        {
            openFile();
        }
        if(save.isArmed())
        {
            JOptionPane.showMessageDialog(null, "Save");
        }
        if(exit.isArmed())
        {
            this.dispose();
        }
        if(f1.isArmed())
        {
            jt.setFont(new Font("Times New Roman", Font.BOLD, 16));
            //applyFontStyle(new Font("Times New Roman", Font.BOLD, 16));
        }
        if(f2.isArmed())
        {
            jt.setFont(new Font("Arial", Font.ITALIC, 16));
            //applyFontStyle(new Font("Arial", Font.ITALIC, 16));
        }
    }

    public void openFile()
    {
        JFileChooser jfc = new JFileChooser();
        int i = jfc.showOpenDialog(null);
        if(i == JFileChooser.APPROVE_OPTION)
        {
            File fl = jfc.getSelectedFile();
            String str = fl.getPath();
            NewFrame nf = new NewFrame(str);
            nf.setSize(400, 400);
            nf.setVisible(true);
        }
    }
    public static void main(String args[])
    {
        SwingMenu sm = new SwingMenu();
        sm.setSize(400,400);
        sm.setVisible(true);
        sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class NewFrame extends JFrame
{
    NewFrame(String s)
    {
        JLabel jl = new JLabel(s);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add("Center",jl);
        try{
            BufferedReader br = new BufferedReader(new FileReader(s));
            String str = "";
            String str1 = "";
            while((str = br.readLine()) != null)
            {
                str1 += str + "\n";
            }
            jl.setText(str1);
            br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}