import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AddTwoNum implements ActionListener{
   JFrame frm;
   JButton b1,b2;
    JPanel p1;
   AddTwoNum(){
    frm=new JFrame("Add Two Numbers...");
    p1=new JPanel(new FlowLayout());

    b1=new JButton("input your number");
    b2=new JButton("cancel");
   
    frm.setSize(350,280);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//use for closing form
    p1.add(b1);p1.add(b2);
    frm.add(p1,BorderLayout.CENTER);

    b1.addActionListener(this);
    b2.addActionListener(this);
    
   }
  public static void main(String args[]){
   new AddTwoNum();
  }

  public void actionPerformed(ActionEvent e){
   int a,b,c;
   if(e.getSource()==b1){
   a=Integer.parseInt(JOptionPane.showInputDialog(frm,"Enter No1:",0));
   b=Integer.parseInt(JOptionPane.showInputDialog(frm,"Enter No2:",0));
   c=a+b;
   JOptionPane.showMessageDialog(frm,"sum is="+c,"result is:",JOptionPane.QUESTION_MESSAGE);
   }
}
}