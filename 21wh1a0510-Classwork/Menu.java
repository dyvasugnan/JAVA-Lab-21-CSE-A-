
import java.awt.*;
import javax.swing.*;
public class Menu extends JFrame{
    JMenuBar mb;
    JMenu f,ed,view;
    JMenuItem op,save,copy,paste,n,sb;
    Menu(){
    Container c = this.getContentPane();
    c.setLayout(new BorderLayout());
    mb = new JMenuBar();
    f = new JMenu("File");
    ed = new JMenu("Edit");
    view = new JMenu("View");
    op = new JMenuItem("open");
    save = new JMenuItem("save");
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
    ed.add(copy);
    ed.add(paste);
    view.add(n);
    view.add(sb);
    }
    public static void main(String args[]) {
    Menu m = new Menu();
    m.setTitle("menu");
    m.setSize(400,400);
    m.setVisible(true);
    }
}
