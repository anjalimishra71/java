import java.io.*;
import java.sql.*;

class JdbcTest{
    public static void main(String args[]){
        int r;
        String n,c;
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anjalimm#31");
         System.out.println("Enter Roll\t Name\t course");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         r=Integer.parseInt(br.readLine());
         n=br.readLine();
         c=br.readLine();
         String sql="insert into students values("+r+",'"+n+"','"+c+"')";
         Statement stmt=con.createStatement();
         int x=stmt.executeUpdate(sql);
         if(x>0)
            System.out.println("record is Saved");
         else
            System.out.println("Not inserted");

            con.close();
        }
        catch(Exception e){
            System.out.println("error"+ e);
        }
    }
}

