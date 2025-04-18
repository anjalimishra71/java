import java.io.*;

class FileDel{
    public static void main(String args[]){
    try{
    File f1=new File("d://a.txt");
    if(f1.exists()){
       f1.delete();
       System.out.println("file deleted");
      }
    else{
     System.out.println("file not found");
    }
     }
     catch(Exception ie){
        ie.printStackTrace();
     }
}
}