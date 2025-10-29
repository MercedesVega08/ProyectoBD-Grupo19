package confg;
import java.sql.*;

public class ConexcionBD {

    private static final String URL = "jdc:mysql://localhost:3307/grupo19";

    private static final String USER = "root";

    private static final String PASSWORD = "Vir474";

    public static Connection getConeConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}