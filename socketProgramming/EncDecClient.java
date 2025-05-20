import java.io.*;
import java.net.*;

public class EncDecClient{
    public static void main(String args[]){
        try{
            String msg1="",msg2="";
            Socket s=new Socket("localhost",5000);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(!(msg1.equalsIgnoreCase("Exit"))){
            System.out.println("Client Enter Message");
            msg1=br.readLine();
            dos.writeUTF(msg1);
            msg2=(String)dis.readUTF();
            System.out.println("Server Message:"+msg2);

          }

        }catch(IOException e){
         System.out.println("Server Error: "+e);
        }
    }
}