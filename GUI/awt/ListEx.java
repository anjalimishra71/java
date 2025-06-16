import java.awt.*;
import java.awt.event.*;

class ListEx implements ItemListener{
  Frame frm;
  Label l1;
  List lst;
  Button b1;
  ListEx(){
    frm=new Frame("java example");
    b1=new Button("My Button");
    lst=new List(3,true);
    lst.add("plz select");
    lst.add("java");
    lst.add("php");
    lst.add("python");
    l1=new Label("Select Language");
    frm.setLayout(new FlowLayout());
  

    frm.add(l1);frm.add(lst);
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    // frm.setResizable(false);
    lst.addItemListener(this);
      // frm.setLayout(null);
    // b1.setBounds(180,140,70,50);//x,y,h,w
    frm.add(b1);
  }
public void itemStateChanged(ItemEvent ie){
    System.out.println("Selected Language:"+ lst.getSelectedItem());
    String lst1[]=lst.getSelectedItems();
    for(int i=0;i<lst1.length;i++){
        System.out.println("Selected Language:"+lst1[1]);
    }
}
public static void main(String args[]){
    new ListEx();
}
  }

