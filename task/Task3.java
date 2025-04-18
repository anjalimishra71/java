// WAP to input any filename And perform swapcase char into file.

import java.io.*;
import java.util.Scanner;

class Task3 {
    public static void main(String args[]) {
        try {
            String fname;
            int ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter filename:");
            fname = sc.nextLine();

            FileReader fr = new FileReader(fname);  
            FileWriter temp = new FileWriter("d://temp.txt");  

            while ((ch = fr.read()) != -1) {
                char c = (char) ch;
                if (c >= 'A' && c <= 'Z') {
                    temp.write(String.valueOf(c).toLowerCase());  
                } else if (c >= 'a' && c <= 'z') {
                    temp.write(String.valueOf(c).toUpperCase());  
                } 
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

            System.out.println("Swapcase completed");

        } catch (Exception ie) {
            ie.printStackTrace();
        }
    }
}