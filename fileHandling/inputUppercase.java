import java.io.*;

class inputUppercase{
    public static void main(String args[]){
        try{
        String line,fname;

        System.out.println("enter file name/location");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));            
        fname=br1.readLine();
        BufferedReader br=new BufferedReader(new FileReader(fname));
        while((line=br.readLine())!=null){
        System.out.println(line.toUpperCase());
        }
       br.close();
        }

       catch(Exception ie){
         ie.printStackTrace();
       }
    }
}