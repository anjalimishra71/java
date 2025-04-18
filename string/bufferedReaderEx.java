import java.io.*;
class bufferedReaderEx{
    public static void main(String args[]) throws IOException{
    String n;
    int a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name..");
    n=br.readLine();
    System.out.println("Enter age..");
    a=Integer.parseInt(br.readLine());
    System.out.println("name "+n+" age "+a);
    }
}