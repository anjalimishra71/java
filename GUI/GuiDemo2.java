import java.awt.*;
import java.awt.event.*;

public class GuiDemo2 implements ActionListener{
  Frame frm;
  Button b1,b2;
  Label l1;
  TextField t1;
  GuiDemo2(){
    frm=new Frame("My Frame : Project");
    b1=new Button("Button1");
    b2=new Button("Button2");

    t1=new TextField(30);
    l1=new Label("Enter Name");
    frm.setLayout(new FlowLayout());
    frm.add(l1);frm.add(t1);frm.add(b1);frm.add(b2);
    frm.setTitle("My New title");
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    b1.addActionListener(this);
     b2.addActionListener(this);
  }
public static void main(String args[]){
   GuiDemo2 obj=new GuiDemo2(); 
}

public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1)
       t1.setText("Button1 is clicked!!!");
    else{
        // System.out.println(t1.getText());
        t1.setText("Button2 is clicked!!");
    }
}
}