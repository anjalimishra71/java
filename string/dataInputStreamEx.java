import java.io.*;
// it is deprecated
class dataInputStreamEx {
    public static void main(String args[]) throws IOException {
        String n;
        int a;

        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter name..");
        n = dis.readLine();  
        System.out.println("Enter age.."); 
        a = Integer.parseInt(dis.readLine());

        System.out.println("name: " + n + " age: " + a);
    }
}