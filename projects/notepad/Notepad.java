import java.awt.*;
import java.awt.event.*;

public class Notepad implements ActionListener{
    Frame frm;
    TextArea tr;
    MenuBar mbar;
    Menu file,edit,format,view,help,submenu;
    MenuItem newtab,newWindow,open,save,saveAs,pageSetup,print,exit,statusbar,wordwrap,undo,cut,copy,paste,delete,serAndBing,find,findNex,findPre,replace,goAndto,selAll,timeAndDate,font,vHelp,sendFeed,aboutNot;
    Notepad(){
    frm=new Frame("Untitled:Notepad");
    tr=new TextArea("This is a menu and submenu example",50,170,TextArea.SCROLLBARS_BOTH);
    mbar=new MenuBar();
    file=new Menu("File");
    edit=new Menu("Edit");
    view=new Menu("view");

    
    // file
    newtab=new MenuItem("New tab    Ctrl+N");
    newWindow=new MenuItem("New Window    Ctrl+shift+N");
    open=new MenuItem("open...    Ctrl+o");
    save=new MenuItem("save    Ctrl+s");
    saveAs=new MenuItem("save as    Ctrl+Shift+s");
    pageSetup=new MenuItem("page setup");
    print=new MenuItem("print    Ctrl+p");
    exit=new MenuItem("exit    Ctrl+x");  

    file.add(newtab);
    file.add(newWindow);
    file.add(open);
    file.add(save);
    file.add(saveAs);
    file.addSeparator();
    file.add(pageSetup);
    file.add(print);
    file.addSeparator();
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
   
    edit.add(undo);
    edit.addSeparator();
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
    

//format
  wordwrap=new MenuItem("Word Wrap");
  font=new MenuItem("Font...");

  format.add(wordwrap);
  format.add(font);

    // view
    submenu=new Menu("zoom");
    statusbar =new MenuItem("Status bar");
    submenu.add(new MenuItem("zoom in        ctrl+plus"));
    submenu.add(new MenuItem("zoom out       ctrl+minus"));
    submenu.add(new MenuItem("Restore default zoom     ctrl+0"));


    view.add(submenu);
    view.add(statusbar);


    //help
     vHelp=new MenuItem("View Help");
    sendFeed=new MenuItem("Send Feedback");
    aboutNot=new MenuItem("About Notepad");

    help.add(vHelp);
    help.add(sendFeed);
    help.addSeparator();
    help.add(aboutNot);





    mbar.add(file);
    mbar.add(edit);
    mbar.add(format);
    mbar.add(view);
    mbar.add(help);
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