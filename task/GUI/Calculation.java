import java.awt.*;
import java.awt.event.*;

public class Calculation implements ActionListener{
  Frame frm;
  Button b1,b2,b3,b4;
  Label l1,l2,l3,l4;
  TextField t1,t2,t3;
  Calculation(){
    frm=new Frame("My Frame : Project");
    b1=new Button("+");
    b2=new Button("-");
    b3=new Button("*");
    b4=new Button("/");

     t1=new TextField(30);
     t2=new TextField(30);
       t3=new TextField(30);
    
     l1=new Label("Enter First No.");
     frm.setLayout(new FlowLayout());

     l2=new Label("Enter Second No.");
    
     l3=new Label("Total No.   ");
    
     l4=new Label("            ");//only for space

    frm.add(l1);frm.add(t1);frm.add(l2);frm.add(t2);frm.add(l3);
    frm.add(t3);frm.add(l4);frm.add(b1);frm.add(b2);frm.add(b3);frm.add(b4);
    frm.setTitle("My New title");
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
  }
public static void main(String args[]){
   Calculation obj=new Calculation(); 
}
public void actionPerformed(ActionEvent e){
          Integer num1 = Integer.valueOf(t1.getText());
            Integer num2 = Integer.valueOf(t2.getText());
            Integer result = 0;

            if (e.getSource() == b1) {
                result = num1 + num2;
            } else if (e.getSource() == b2) {
                result = num1 - num2;
            } else if (e.getSource() == b3) {
                result = num1 * num2;
            } else if (e.getSource() == b4) {
                result = num1 / num2;
            }

            t3.setText(String.valueOf(result));
   }
}