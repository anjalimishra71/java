import java.awt.*;
import java.awt.event.*;
import java.io.*;

class SignupForm implements ActionListener{
    Frame frm;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    SignupForm(){
        frm=new Frame("Signup Form");
       l1=new Label("Username:");
       t1=new TextField(30);
       l2=new Label("Password");
       t2=new TextField(30);
       t2.setEchoChar('*'); 
       l3=new Label("ReEnterPass:");
       t3=new TextField(26);

       b1=new Button("Save");
       b2=new Button("cancel");
       
       frm.setLayout(new FlowLayout());
       frm.add(l1);frm.add(t1)
       ;frm.add(l2);frm.add(t2);
       frm.add(l3);frm.add(t3);
       frm.add(b1);frm.add(b2);
       frm.setSize(450,300);
        frm.setVisible(true);
       frm.setLocationRelativeTo(null);
       frm.setResizable(false);
         b1.addActionListener(this);
         b2.addActionListener(this);     
    }
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String user = t1.getText();
            String pass = t2.getText();
            String repass = t3.getText();
            int len=pass.length();
            if (user.isEmpty() || pass.isEmpty() || repass.isEmpty()) {
                System.out.println("All fields are required.");
            } 
            else if (len!=8) {
                System.out.println("Passwords must ba 8 digit");
            } 
            
            else if (!pass.equals(repass)) {
                System.out.println("Passwords do not match.");
            } 
            else {
                System.out.println("Signup successful for user: " + user);
                try{
                FileWriter fw=new FileWriter("d:\\userAndPass.txt",true);
                fw.write(user+","+pass+"\n");
                fw.close();
                frm.setVisible(false);
                new LoginForm();
                }
                catch(Exception ie){
                    ie.printStackTrace();
                }
            }
        }
    }

   public static void main(String args[]){
    new SignupForm();
   }
}