// write a CLA in which we get a file name & print it's content in reverse order.
import java.io.*;
class Task1{
    public static void main(String args[]){
     try{
         String line,fname;
         String a;
         String page="";
         a=args[0];
          BufferedReader br=new BufferedReader(new FileReader(a));

         while((line=br.readLine())!=null){
          page+=line;
         }
           String reversed = "";
        for (int i = page.length() - 1; i >= 0; i--) {
            reversed += page.charAt(i);
            System.out.println(reversed);
        }
        
        br.close();
     }
     catch(Exception ie){
        ie.printStackTrace();
     }
     
    }
} 