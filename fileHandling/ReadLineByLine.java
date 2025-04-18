import java.io.*;

class ReadLineByLine{
    public static void main(String args[]){  
    try{
       String line;
       BufferedReader br =new BufferedReader(new FileReader("d://a.txt"));
       while((line=br.readLine())!=null){
        System.out.println(line);
       }
      br.close();
      }catch(Exception ie){
        ie.printStackTrace();
      }
    }
}