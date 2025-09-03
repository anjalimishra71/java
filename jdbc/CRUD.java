import java.io.*;
import java.sql.*;

class CRUD{
    static Connection con;
    static ResultSet rs;
    static Statement stmt;
    static int r;
    static String n,c;
    static BufferedReader br;

    static void connect(){
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anjalimm#31");
        }catch(Exception e){
         System.out.println("Connection Error: "+e);
        }
    }

    static void saveStudent(){
        try{
         connect();
         System.out.println("Enter Roll\t Name\t Course");
         br=new BufferedReader(new InputStreamReader(System.in));
         r=Integer.parseInt(br.readLine());
         n=br.readLine();
         c=br.readLine();
         String sql="insert into jdbc values("+r+",'"+n+"','"+c+"')";
         stmt=con.createStatement();
         int x=stmt.executeUpdate(sql);
         if(x>0){
            System.out.println("Record is saved");
         }
         else{
            System.out.println("Not inserted");
         }
         con.close();
         showStudent();
        }catch(Exception e){
          System.out.println("Input Error");
          e.printStackTrace();
        }
    }


   static boolean isStudentExist(int st_id){
     boolean chk=false;
     try{
       connect();
       String sql="select * from jdbc where roll="+st_id;
       stmt=con.createStatement();
       rs=stmt.executeQuery(sql);
       chk=rs.next()?true:false;
     }catch(Exception e){
        System.out.println("check student error"+e);
     }
     return chk;
   }


static void updateStudent(){
    try{
       br=new BufferedReader(new InputStreamReader(System.in));
       connect();
       System.out.println("Enter roll to update");
       r=Integer.parseInt(br.readLine());
       if(isStudentExist(r)){
        System.out.println("Enter Name\t Course");
         n=br.readLine();
         c=br.readLine();
         String sql="update jdbc set name='"+n+"',cource='"+c+"',where id="+r;
         stmt=con.createStatement();
         int x=stmt.executeUpdate(sql);
         if(x>0)
           System.out.println("Record is updated");
           con.close();
           showStudent();
       }else
         System.out.println("Student not found for update!!");
       
    }catch(Exception e){
       System.out.println("Input error:");
    }
}


    static void showStudent(){
        try{
           connect();
           String sql="select * from jdbc order by name";
           stmt=con.createStatement();
           rs=stmt.executeQuery(sql);
           System.out.println("Roll\t Name\t Course\n__________________________\n");
          while(rs.next()){
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
          }
          con.close();
        }catch(Exception e){
             System.out.println("Input Error");
             e.printStackTrace();
        }
    }

    static void deleteStudent(){
        try{
          connect();
          System.out.println("Enter Roll to Delete?");
          br=new BufferedReader(new InputStreamReader(System.in));
          r=Integer.parseInt(br.readLine());
          String sql="delete from jdbc where roll="+r;
          stmt=con.createStatement();
          int x=stmt.executeUpdate(sql);
          if(x>0)
            System.out.println("Record is deleted");
            con.close();
            showStudent();

        }catch(Exception e){
             System.out.println("Input Error");
             e.printStackTrace();
        }
    }


    public static void main(String args[])throws IOException{
        int ch;
        do{
          System.out.println("Enter your choice[1:Save 2:Show 3:Delete 4:update 5:Exit]");
          br=new BufferedReader(new InputStreamReader(System.in));
          ch=Integer.parseInt(br.readLine());
          switch(ch){
            case 1:
                saveStudent();
                break;
            case 2:
                showStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                updateStudent();
                break;    
            case 5:
                System.out.println("Exiting .....Have good day");
                System.exit(0);
                break;
            default:
                System.out.println("Sorry! Wrong Choice...");
                break;
          }
        }while(ch<4);
    }
}