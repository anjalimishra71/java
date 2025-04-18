import java.io.*;

class CountFromInput{
    public static void main(String args[]){
        try{
        String fname;
        int ch;
        int characterLen=0,word=0,line=0;
        System.out.println("enter file name/location");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));            
        fname=br1.readLine();
        BufferedReader br=new BufferedReader(new FileReader(fname));
        if(br!=null){
        System.out.println("file found");
        // char by char
          while((ch=br.read())!=-1){
            if(((char)ch)==' ' ||((char)ch)=='\n'){
                word++;
            }
            if(((char)ch)=='\n'){
                line++;
            }
             if(((char)ch)!=' ' && ((char)ch)!='\n'){
                characterLen++;
            }
           }
            System.out.println("character= "+(characterLen)+ " word= "+(word+1) +" line= "+(line+1));
         br.close();

        }
        }
       catch(Exception ie){
         ie.printStackTrace();
       }
    }
}