import java.io.*;
import java.net.*;

public class Sr{
    public static void main(String args[]){
        try{
           String msg1,msg2="";
           ServerSocket ss=new ServerSocket(5000);
           Socket s=ss.accept();
           DataInputStream dis=new DataInputStream(s.getInputStream());
           DataOutputStream dos=new DataOutputStream(s.getOutputStream());
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           while(!(msg2.equalsIgnoreCase("Exit"))){
                msg2=(String)dis.readUTF();
            System.out.println("Client Message"+msg2);
            System.out.println("Server Enter Message:");
            msg1=br.readLine();

            dos.writeUTF(msg1);
           }
        }catch(IOException e){
         System.out.println("Server Error: "+e);
        }
    }
}