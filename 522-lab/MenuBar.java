package javaclass;
import java.awt.*;
import javax.swing.*;
public class MenuBar extends JFrame{
    JMenuBar mb;
    JMenu f,ed,view;
    JMenuItem op,save,exit,cut,copy,paste,n,sb;
    MenuBar(){
    Container c = this.getContentPane();
    c.setLayout(new BorderLayout());
    mb = new JMenuBar();
    f = new JMenu("File");
    ed = new JMenu("Edit");
    view = new JMenu("View");
    op = new JMenuItem("open");
    save = new JMenuItem("save");
    exit = new JMenuItem("exit");
    cut = new JMenuItem("cut");
    copy = new JMenuItem("copy");
    paste = new JMenuItem("paste");
    n = new JMenuItem("normal");
    sb = new JMenuItem("scroll bar");
    c.add("North",mb);
    mb.add(f);
    mb.add(ed);
    mb.add(view);
    f.add(op);
    f.add(save);
    f.add(exit);
    ed.add(cut);
    ed.add(copy);
    ed.add(paste);
    view.add(n);
    view.add(sb);
    }
    public static void main(String args[]) {
    MenuBar m = new MenuBar();
    m.setTitle("Menu");
    m.setSize(400,400);
    m.setVisible(true);
    }
}