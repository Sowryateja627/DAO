import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Create the connection
            String url = "jdbc:postgresql://localhost/postgres";
            String user = "postgres";
            String pass = "4453";
            connection = DriverManager.getConnection(url, user, pass);

            // Create DAO instance and retrieve department
            DAO<Dept> departmentDao = new DeptDAO(connection);
            Dept dept20 = departmentDao.find(20);
            System.out.println(dept20);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
