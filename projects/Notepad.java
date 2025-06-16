import java.awt.*;
import java.awt.event.*;

public class Notepad implements ActionListener{
    Frame frm;
    TextArea tr;
    MenuBar mbar;
    Menu file,edit,view,submenu;
    MenuItem newtab,newWindow,open,recent,save,saveAs,saveAll,pageSetup,print,closeTab,closeWind,exit,statusbar,wordwrap,undo,cut,copy,paste,delete,serAndBing,find,findNex,findPre,replace,goAndto,selAll,timeAndDate,font;
    Notepad(){
    frm=new Frame("Untitled:Notepad");
    tr=new TextArea("This is a menu and submenu example",50,170,TextArea.SCROLLBARS_BOTH);
    mbar=new MenuBar();
    file=new Menu("File");
    edit=new Menu("Edit");
    view=new Menu("view");

    
    // file
    newtab=new MenuItem("New tab    Ctrl+N");
    newWindow=new MenuItem("New window    Ctrl+shift+N");
    open=new MenuItem("open    Ctrl+o");
    recent=new MenuItem("Recent");
    save=new MenuItem("save    Ctrl+s");
    saveAs=new MenuItem("save as    Ctrl+Shift+s");
    saveAll=new MenuItem("save all   Ctrl+Alt+s");
    pageSetup=new MenuItem("page setup");
    print=new MenuItem("print    Ctrl+p");
    closeTab=new MenuItem("close tab    Ctrl+w");
    closeWind=new MenuItem("close Window    Ctrl+shift+w");
    exit=new MenuItem("exit    Ctrl+x");  

    file.add(newtab);
    file.add(newWindow);
    file.add(open);
    file.add(recent);
    file.add(save);
    file.add(saveAs);
    file.add(saveAll);
    file.addSeparator();
    file.add(pageSetup);
    file.add(print);
    file.addSeparator();
    file.add(closeTab);
    file.add(closeWind);
    file.add(exit);


    // edit
    undo=new MenuItem("Unde      Ctrl+Z");
    cut=new MenuItem("Cut      Ctrl+X");
    copy=new MenuItem("Copy      Ctrl+C");
    paste=new MenuItem("Paste      Ctrl+V");
    delete=new MenuItem("Delete      Del");
    serAndBing=new MenuItem("Search with Bing      Ctrl+E");
    find=new MenuItem("Find      Ctrl+F");
    findNex=new MenuItem("Find next      F3");
    findPre=new MenuItem("Find previous      Shift+F3");
    replace=new MenuItem("Replace      Ctrl+H");
    goAndto=new MenuItem("Go to      Ctrl+G");
    selAll=new MenuItem("Select all      Ctrl+A");
    timeAndDate=new MenuItem("Time/Date      F5");
    font=new MenuItem("Font");
   
    edit.add(undo);
    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(delete);
    edit.addSeparator();
    edit.add(serAndBing);
    edit.addSeparator();
    edit.add(find);
    edit.add(findNex);
    edit.add(findPre);
    edit.add(replace);
    edit.add(goAndto);
    edit.addSeparator();
    edit.add(selAll);
    edit.add(timeAndDate);
    edit.addSeparator();
    edit.add(font);

    // view
    submenu=new Menu("zoom");
    statusbar =new MenuItem("Status bar");
    wordwrap =new MenuItem("Word wrap");
    submenu.add(new MenuItem("zoom in        ctrl+plus"));
    submenu.add(new MenuItem("zoom out       ctrl+minus"));
    submenu.add(new MenuItem("Restore default zoom     ctrl+0"));


    view.add(submenu);
    view.add(statusbar);
    view.add(wordwrap);

    mbar.add(file);
    mbar.add(edit);
    mbar.add(view);
    frm.setLayout(new FlowLayout());
    frm.setMenuBar(mbar);
    frm.add(tr);
    frm.setSize(1200,900);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    exit.addActionListener(this);

   }
   public static void main(String args[]){
    new Notepad();
   }
   public void actionPerformed(ActionEvent e){
    System.exit(0);
   }

}