import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
  Frame frm;
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
  TextField t1;
  Calculation(){
    frm=new Frame("My Frame : Project");
    b1=new Button("+");
    b2=new Button("-");
    b3=new Button("*");
    b4=new Button("/");
    b5=new Button("1");
    b6=new Button("2");
    b7=new Button("3");
    b8=new Button("4");
    b9=new Button("5");
    b10=new Button("6");
    b11=new Button("7");
    b12=new Button("8");
    b13=new Button("9");
    b14=new Button("0");
    b15=new Button("C");
    b16=new Button("=");


     t1=new TextField(30);
   
    
     frm.setLayout(new FlowLayout());

         
    //  l4=new Label("            ");//only for space

    frm.add(t1);frm.add(b1);frm.add(b2);frm.add(b3);frm.add(b4);
    frm.add(b5);frm.add(b6);frm.add(b7);frm.add(b8);frm.add(b9);frm.add(b10);frm.add(b11);frm.add(b12);
    frm.add(b13);frm.add(b14);frm.add(b15);frm.add(b16);
    frm.setTitle("My New title");
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);




     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
      b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
      b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
      b10.addActionListener(this);
     b11.addActionListener(this);
     b12.addActionListener(this);
      b13.addActionListener(this);
     b14.addActionListener(this);
     b15.addActionListener(this);
      b16.addActionListener(this);
    
    
  }
public static void main(String args[]){
   Calculator obj=new Calculation(); 
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