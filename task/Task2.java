// write a ClA to input any file name and copy its uppercase & lowercase into separate file
import java.io.*;
class Task2{
    public static void main(String args[]){
     try{
         String line,fname;
        int ch;
         String a=args[0];
          FileWriter fwUpp=new FileWriter("d:\\uppercase.txt");
          FileWriter fwLow=new FileWriter("d:\\lowercase.txt");
          FileReader fr=new FileReader(a);
        
         while((ch=fr.read())!=-1){
          if(ch>=65 && ch<=90){
            fwUpp.write((char)ch);
          }
         if(ch>=97 && ch<=122){
            fwLow.write((char)ch);
          }
      
        }
        fr.close();
        fwUpp.close();
        fwLow.close();

        System.out.println("Uppercase and lowercase letters copied.");

     }
     catch(Exception ie){
        ie.printStackTrace();
     }
     
    }
} 