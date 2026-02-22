import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schooldb",
                "root",
                "Sabari24*"
            );

            System.out.println("CONNECTED SUCCESSFULLY");

        } catch (Exception e) {
            System.out.println("CONNECTION FAILED");
            e.printStackTrace();
        }
    }
}