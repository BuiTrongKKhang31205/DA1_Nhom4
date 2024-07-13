package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author buitr
 */
public class Database {
    private static Connection connection;
    private static final String jdbcUrl = "jdbc:sqlserver://localhost:1436;databaseName=DA1;encrypt=true;trustServerCertificate=true";
    private static final String username = "sa";
    private static final String password = "1Secure*Password1"; // phụ thuộc tài khoản đăng nhập azude
    // Phương thức tạo kết nối
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("KN thanh cong");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    public static void main(String[] args) {
        Database.getConnection();
    }
}
