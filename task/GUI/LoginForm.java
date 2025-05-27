import java.awt.*;
import java.awt.event.*;
import java.io.*;

class LoginForm implements ActionListener{
    Frame frm;
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2,b3;
    LoginForm(){
        frm=new Frame("Login Form");
       l1=new Label("Username:");
       t1=new TextField(30);
       l2=new Label("Password");
       t2=new TextField(30);
       t2.setEchoChar('*'); 

       b1=new Button("Login");
       b2=new Button("cancel");
       b3=new Button("Signup");
       
       frm.setLayout(new FlowLayout());
       frm.add(l1);frm.add(t1);frm.add(l2);frm.add(t2);frm.add(b1);frm.add(b2);frm.add(b3);
       frm.setSize(450,300);
        frm.setVisible(true);
       frm.setLocationRelativeTo(null);
       frm.setResizable(false);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
        
    }

     public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            String user=t1.getText();
            String pass=t2.getText();
                boolean loginSuccess = false;

            try{
                BufferedReader br=new BufferedReader(new FileReader("d:\\userAndPass.txt"));
                String data;
                
                while ((data = br.readLine()) != null) {
                    String[] parts = data.split(",");
                    if (user.equals(parts[0]) && pass.equals(parts[1])) {
                       loginSuccess=true;
                       break;
                    } 
                }
            }
          catch(Exception ie){
            ie.printStackTrace();
          }
          if(loginSuccess){
             System.out.println("Login successful!");
          }
          else{
            System.out.println("Username or password is incorrect.");

          }
        }
        if(e.getSource()==b3){
            frm.setVisible(false);
            new SignupForm();

        }
    }
   public static void main(String args[]){
    new LoginForm();
   }
}