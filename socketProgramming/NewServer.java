import java.net.*;
import java.io.*;

public class NewServer{
    public static void main(String args[]){
        try{
          int port=5000;
          String msg="";
          ServerSocket sersoc=new ServerSocket(port);

          System.out.println("server is running on"+ port +" port number\n waiting for client...");
          Socket cl=sersoc.accept();
 
          System.out.println("client connected..");
          
          DataInputStream dis=new DataInputStream(cl.getInputStream());
        
          msg=(String)dis.readUTF();
          System.out.println("client says: "+msg);
          cl.close();
          System.out.println("client disconnect.."); 
 
        }catch(IOException ie){
          System.out.println("IO Error"+ie);
        }
    }
}