//WAP to input any filename and encrypt in original file and decrypt the file name
import java.io.*;
import java.util.Scanner;
class Task4{
    public static void main(String args[]){
        try {
            String fname;
            int ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter filename:");
            fname = sc.nextLine();

            FileReader fr = new FileReader(fname);  
            FileWriter temp = new FileWriter("d://temp.txt");  
        
            System.out.println("Choose any one option\n 1>for encryption\n 2>for decryption");
            int n=sc.nextInt();

         switch(n){
            case 1:
                 while ((ch = fr.read()) != -1) {
                    int enc=ch+15;
                   char c = (char) enc;
                    temp.write(c);  
                }
                System.out.println("file is encrpted..");
                break;

            case 2:
                   while ((ch = fr.read()) != -1) {
                    int dec=ch-15;
                   char c = (char) dec;
                    temp.write(c);  
                }
                System.out.println("file is decrypted..");
                break;  
            
            default:
                  System.out.println("Please choose 1 or 2");
                  break;
         }
        fr.close();
        temp.close();

         FileReader tempReader = new FileReader("d://temp.txt");
         FileWriter fw = new FileWriter(fname);

            while ((ch = tempReader.read()) != -1) {
                fw.write(ch);
            }

            tempReader.close();
            fw.close();
        } 
        catch (Exception ie) {
            ie.printStackTrace();
        }
    }
}