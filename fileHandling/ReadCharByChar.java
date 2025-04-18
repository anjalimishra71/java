import java.io.*;

class ReadCharByChar{
    public static void main(String args[]){
        try{
            int ch;
            FileReader fr=new FileReader("d://a.txt");
            if(fr!=null){
                System.out.println("File found");
            while((ch=fr.read())!=-1){
                System.out.println((char)ch);
            }
            fr.close();
            }

        }
        catch(Exception ie){
            ie.printStackTrace();
        }
    }
}