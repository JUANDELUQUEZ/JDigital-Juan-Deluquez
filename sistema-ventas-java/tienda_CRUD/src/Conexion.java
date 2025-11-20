import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  // Variables Secretas
  String url = "jdbc:mysql://localhost:3306/tienda_crud";
  String usuario = "root";
  String clave = "";

  public Connection conectar() {
    // variable vacia 
    Connection link = null;

    try {
      link = DriverManager.getConnection(url, usuario, clave);
      System.out.println("Conexión exitosa!");


    } catch (SQLException e) {
      // Si falla regresa el error 
      System.out.println("Error al conectar " + e);
    }

    // Devuelve la conceccion o NULL si fallo 
    return link;
  }
}