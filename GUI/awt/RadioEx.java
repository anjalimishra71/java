import java.awt.*;
import java.awt.event.*;

public class RadioEx implements ActionListener{
    Frame frm;
    Button b1;
    Label l1;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;  //direct we can not create radio in aws so use checkboxGroup
    RadioEx(){
        frm=new Frame("My frame: project");
        b1=new Button("button");
        l1=new Label("Select any training");
        c1=new Checkbox("java");
        c2=new Checkbox("php");

        cbg=new CheckboxGroup();
        c3=new Checkbox("asp.net",false,cbg);
        c4=new Checkbox("Mern",false,cbg);

        frm.setLayout(new FlowLayout());
        frm.add(l1);frm.add(c1);frm.add(c2);frm.add(c3);frm.add(c4);frm.add(b1);
        frm.setSize(400,300);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        b1.addActionListener(this);
        
    } 
    public static void main(String args[]){
        RadioEx obj=new RadioEx();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(c1.getState())
               System.out.println(c1.getLabel());
            if(c2.getState())
                System.out.println(c2.getLabel());
             if(c3.getState()||c4.getState())
                System.out.println(cbg.getSelectedCheckbox().getLabel());

        }
    }

}