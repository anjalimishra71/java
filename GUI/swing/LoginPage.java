import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LoginPage implements ActionListener{
   JFrame frm;
   JButton b1,b2;
   JTextField t1;
   JPasswordField t2;
   JLabel l1,l2,title;
   JPanel p1,p2,p3;
   Font f;
   LoginPage(){
    frm=new JFrame("Login");
    t1=new JTextField(20);
    t2=new JPasswordField(20);
    b1=new JButton("sign in");
    b2=new JButton("cancel");
    title =new JLabel("Login here");
    l1=new JLabel("Username");
    l2=new JLabel("Password");
    f=new Font("Malgun Gothic",Font.BOLD,30);
    title.setFont(f);
    title.setForeground(Color.YELLOW);
   //  t2.setEchoChar('$');
    p1=new JPanel(new FlowLayout());
    p1.add(title);
    p1.setBackground(new Color(200,0,0));
    p2=new JPanel(new FlowLayout(FlowLayout.CENTER,20,30));
    p3=new JPanel(new FlowLayout());
    p2.setBackground(Color.PINK);
    p2.setForeground(new Color(100,100,200));
    p3.setBackground(Color.YELLOW);

    p2.add(l1);p2.add(t1);p2.add(l2);p2.add(t2);p3.add(b1);p3.add(b2);
    frm.add(p1,BorderLayout.NORTH);
    frm.add(p2,BorderLayout.CENTER);
    frm.add(p3,BorderLayout.SOUTH);
    frm.setSize(350,280);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//use for closing form
    b1.addActionListener(this);
    b2.addActionListener(this);
    
   }
  public static void main(String args[]){
   new LoginPage();
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource()==b1)
   JOptionPane.showMessageDialog(frm,"Login Success!!");
  
  if(e.getSource()==b2){
   System.exit(0);
  }
}
}