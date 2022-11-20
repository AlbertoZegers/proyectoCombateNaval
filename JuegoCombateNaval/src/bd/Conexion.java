package bd;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {   
        public static Connection getConexion() {
			
		String user="root";		
		String password="";		
		String baseDeDatos="BD";		

        Connection connection = null;
        try {
           String driverClassName = "com.mysql.jdbc.Driver";
           String driverUrl="jdbc:mysql://localhost/"+baseDeDatos;
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}