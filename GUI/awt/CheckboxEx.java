import java.awt.*;
import java.awt.event.*;

public class CheckboxEx implements ActionListener{
    Frame frm;
    Button b1;
    Label l1;
    Checkbox c1,c2,c3,c4;
    CheckboxEx(){
        frm=new Frame("My frame: project");
        b1=new Button("Button1");
        l1=new Label("select any training");
        c1=new Checkbox("java");
        c2=new Checkbox("php");
        c3=new Checkbox("mern",true);
        c4=new Checkbox("Asp.net");
frm.setLayout(new FlowLayout());
frm.add(l1);frm.add(c1);frm.add(c2);frm.add(c3);frm.add(c4);frm.add(b1);
frm.setSize(400,300);
frm.setVisible(true);
frm.setLocationRelativeTo(null);
b1.addActionListener(this);
    }
    public static void main(String args[]){
        CheckboxEx obj=new CheckboxEx();
    }
    public void actionPerformed(ActionEvent e){
        
    }
}