import java.awt.*;

public class GuiDemo{
  Frame frm;
  Button b1;
  Label l1;
  TextField t1;
  GuiDemo(){
    frm=new Frame("My Frame : Project");
    b1=new Button("click");
    t1=new TextField(50);
    l1=new Label("Enter Name");
    frm.setLayout(new FlowLayout());
    frm.add(l1);frm.add(t1);frm.add(b1);
    frm.setTitle("My New title");
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    
  }
public static void main(String args[]){
   GuiDemo obj=new GuiDemo(); 
}
}