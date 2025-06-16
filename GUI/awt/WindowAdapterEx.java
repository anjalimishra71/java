import java.awt.*;
import java.awt.event.*;
class WindowAdapterEx{
    Frame frm;
class WindowAdapterEx(){
    frm=new Frame("java example");
    frm.setSize(400,300);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setResizable(false);
    frm.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
}
    public static void main(String args[]){
        new WindowAdapterEx();
    }
}
