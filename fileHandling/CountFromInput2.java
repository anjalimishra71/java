import java.io.*;
class CountFromInput2{
    public static void main(String args[]){
        try{
        String line , fname;
    
        int characterLen=0,wordLen=0,lineLen=0;
        System.out.println("enter file name/location");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));            
        fname=br1.readLine();
        BufferedReader br=new BufferedReader(new FileReader(fname));
        System.out.println("file found");
        // line by line 
          while((line=br.readLine())!=null){
            lineLen++;
            characterLen+=line.length();
          }
          System.out.println("character= "+(characterLen)+ " word= "+(wordLen) +" line= "+(lineLen+1));
          br.close();      
        }
       catch(Exception ie){
         ie.printStackTrace();
       }
    }
}