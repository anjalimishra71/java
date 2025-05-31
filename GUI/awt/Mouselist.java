import java.awt.*;
import java.awt.event.*;

class Mouselist implements MouseListener{
    Frame frm;
    Mouselist(){
        frm=new Frame("Mouse Event:");
        frm.addMouseListener(this);
        frm.setSize(600,400);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setLayout(null);
    }
    public static void main(String args[]){
        new Mouselist();
    }
    public void mouseExited(MouseEvent e){
        System.out.println("exited");
    }

     public void mousePressed(MouseEvent e){
        System.out.println("pressed");
    }

     public void mouseReleased(MouseEvent e){
        System.out.println("Released");
    }

     public void mouseClicked(MouseEvent e){
        System.out.println("clicked");
    }

     public void mouseEntered(MouseEvent e){
        System.out.println("Entered");
    }
}