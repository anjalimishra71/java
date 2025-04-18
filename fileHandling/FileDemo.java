import java.io.*;

class FileDemo{
    public static void main(String args[]){
     try{
      File f1=new File("d://a.txt");
      f1.createNewFile();
      if(f1.exists()){
        System.out.println("File Name: "+f1.getName());
        System.out.println("File Location: "+f1.getAbsolutePath());
        System.out.println("File size: "+ f1.length());
        System.out.println("File readable: "+f1.canRead());
        System.out.println("File writable: "+f1.canWrite());
      }
    else{
     System.out.println("Unable to create file");
    }
     }
     catch(Exception ie){
        ie.printStackTrace();
     }
}
}