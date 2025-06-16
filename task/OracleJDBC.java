import java.sql.*;

public class OracleJDBC  {
    public static void main(String[] args) {
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Connect to the database
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE", "system", "anjalimm#31");

            System.out.println("✅ Connected to Oracle Database!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}