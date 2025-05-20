import java.applet.Applet;
import java.awt.Graphics;

// <applet code="AppExample.class" height="300" width="500">
//  </applet>

public class AppExample extends Applet{
  String str="";
  public void init(){
    str+="init->";
  }
  public void start(){
    str+="start()->";
  }

 public void paint(Graphics g){
    str+="paint()";
    g.drawString(str,100,100);
 }
}