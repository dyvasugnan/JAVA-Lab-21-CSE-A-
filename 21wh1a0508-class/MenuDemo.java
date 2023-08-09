import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class MenuDemo extends JFrame implements ActionListener {
    Container c = getContentPane();
    JMenuBar mb = new JMenuBar();
    JMenu f = new JMenu("File");
    JMenu e = new JMenu("Exit");
    JMenu h = new JMenu("Help");
    JMenuItem s = new JMenuItem("save");
    JMenuItem cl = new JMenuItem("Close");
    JMenuItem op = new JMenuItem("Open");
    JMenuItem cp = new JMenuItem("Copy");
    JMenuItem p = new JMenuItem("Paste");
    JMenuItem ct = new JMenuItem("cut");

    void openFile() {
        JFileChooser jc = new JFileChooser();
        int i = jc.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            File sf = jc.getSelectedFile();
            String pathsf = sf.getAbsolutePath();
            NewFrame nf = new NewFrame(pathsf);
            nf.setVisible(true);
            nf.setSize(400, 400);
            nf.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Disposes only the NewFrame
        }
    }

    MenuDemo() {
        BorderLayout b = new BorderLayout();
        c.setLayout(b);
        c.add("North", mb);
        mb.add(f);
        mb.add(e);
        mb.add(h);
        f.add(s);
        f.add(op);
        f.add(cl);
        e.add(cp);
        e.add(p);
        e.add(ct);
        this.setTitle(" MenuDemo");
        op.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        p.addActionListener(this);
        ct.addActionListener(this);
        s.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == op) {
            openFile();
        } else if (ae.getSource() == cl) {
            dispose();
        }
    }
}
class NewFrame extends JFrame {
    JTextArea ta = new JTextArea();
    String str1 = ""; 

    NewFrame(String s) {
        Container c = getContentPane();
        c.add(ta);
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            String str;
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
                System.out.println(str);
            }
            ta.setText(str1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

 class Main {
    public static void main(String[] args) {
        MenuDemo md = new MenuDemo();
        md.setSize(400, 400);
        md.setVisible(true);
        md.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
