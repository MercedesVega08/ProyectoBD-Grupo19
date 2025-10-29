import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexcionBD {

    private static final String URL = "jdc:mysql://localhost:3307/grupo19";

    private static final String USER = "Virginia";

    private static final String PASSWORD = "Vir474";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
