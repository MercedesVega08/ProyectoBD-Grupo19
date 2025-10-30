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
<<<<<<< HEAD

    public static Connection conectar(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch(ClassNotFoundException e){
            System.out.println("Error al cargar el driver: " + e.getMessage());
        } catch(SQLException e){
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return con;
    } 
}
=======
}
>>>>>>> cd07ce5ae38381bb8ed296c25e70b8b49ffe967a
