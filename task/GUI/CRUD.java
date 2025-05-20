import java.awt.*;
import java.awt.event.*;

class CRUD implements ActionListener,ItemListener{
    Frame frm;
    Label l1;
    TextField t1;
    Button b1,b2,b3,b4,b5;
    Choice ch;
    CRUD(){
        frm=new Frame("java example");
       ch=new Choice();
       ch.add("Plz Select");
       l1=new Label("Enter Language");
       t1=new TextField("Choice Example",20);
       b1=new Button("Add");
       b2=new Button("Remove");
       b3=new Button("Update");
       b4=new Button("ClearAll");
       b5=new Button("Add Between");

       frm.setLayout(new FlowLayout());
       frm.add(l1);frm.add(t1);frm.add(ch);frm.add(b1);frm.add(b2);frm.add(b3);frm.add(b4);frm.add(b5);
       frm.setSize(450,300);
        frm.setVisible(true);
       frm.setLocationRelativeTo(null);
       frm.setResizable(false);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         ch.addItemListener(this);
    }

     public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1){
            ch.add(t1.getText());
            System.out.println("Language Added!! Now total:"+ch.getItemCount());

        }

        else if(e.getSource()==b2){
            ch.remove(ch.getSelectedItem());
            System.out.println("Language removed!! Now total:"+ch.getItemCount());
        }
      
      else if(e.getSource() == b3){
        int index = ch.getSelectedIndex();
        String newValue = t1.getText();
            ch.remove(index);                  
            ch.insert(newValue, index);        
            ch.select(index);                  
            System.out.println("Language Updated!! Now total: " + ch.getItemCount());
      }

       else if(e.getSource()==b4){
             ch.removeAll();
             System.out.println(" All Language removed!! Now total:"+ch.getItemCount());

        }

         else if(e.getSource()==b5){
             int index = ch.getSelectedIndex();
             String newValue = t1.getText().trim();
              ch.insert(newValue, index+1);        

             System.out.println(" Languages added in between!! Now total:"+ch.getItemCount());

        }
    }

   public void itemStateChanged(ItemEvent ie){
   String selected = ch.getSelectedItem();
        t1.setText(selected); 
        System.out.println("Selected Language: " + selected);
 }

public static void main(String args[]){
    new CRUD();
}

}