import java.net.*;
import java.io.*;

public class NewClient{
    public static void main(String args[]){
        try{
          int port=5000;
          String msg="";
          Socket server=new Socket("127.0.0.1",port);
          System.out.println("client trying to connect with server on"+port);
          DataOutputStream dos=new DataOutputStream(server.getOutputStream());
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter message for server");
          msg=br.readLine();
          dos.writeUTF(msg);
          server.close();
          System.out.println("client disconnect.."); 
 
        }catch(IOException ie){
          System.out.println("IO Error"+ie);
        }
    }
}