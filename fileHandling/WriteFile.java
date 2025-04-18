import java.io.*;
class WriteFile{
    public static void main(String args[]){
     try{
         String data="Welcome in file handling";
        //  char data_array[]=data.toCharArray();         
          FileWriter fw=new FileWriter("d://a.txt");
       fw.write(data);
    fw.close();
     }
     catch(Exception ie){
        ie.printStackTrace();
     }
     
    }
} 