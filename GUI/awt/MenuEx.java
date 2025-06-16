import java.awt.*;
import java.awt.event.*;

public class MenuEx implements ActionListener{
    Frame frm;
    TextArea tr;
    MenuBar mbar;
    Menu file,edit,submenu;
    MenuItem open,save,copy,paste,exit;
   MenuEx(){
    frm=new Frame("Untitled:Notepad");
    tr=new TextArea("This is a menu and submenu example",50,170,TextArea.SCROLLBARS_BOTH);
    mbar=new MenuBar();
    file=new Menu("File");
    edit=new Menu("Edit");
    submenu=new Menu("zoom");
    open=new MenuItem("open    Ctrl+o");
    save=new MenuItem("save    Ctrl+s");
    exit=new MenuItem("exit    Ctrl+x");
    copy=new MenuItem("copy    Ctrl+c");
    paste =new MenuItem("paste    Ctrl+v");

    file.add(open);
    file.addSeparator();
    file.add(save);
    edit.add(copy);
    edit.addSeparator();
    edit.add(paste);

    submenu.add(new MenuItem("zoom in"));
    submenu.add(new MenuItem("zoom out"));

    file.add(submenu);
    file.add(exit);
    mbar.add(file);
    mbar.add(edit);

    frm.setLayout(new FlowLayout());
    frm.setMenuBar(mbar);
    frm.add(tr);
    frm.setSize(1200,900);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    exit.addActionListener(this);

   }
   public static void main(String args[]){
    new MenuEx();
   }
   public void actionPerformed(ActionEvent e){
    System.exit(0);
   }

}