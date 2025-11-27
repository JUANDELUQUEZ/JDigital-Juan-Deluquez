// Tenemos tres PF (partes funcionales) en el trabajo

// PF#1 - Herramientas
import java.sql.Connection; // Libreria para mantener la conexion con la base de datos 
import java.sql.DriverManager; // Esta es una clase que controla los "drivers" algo que entienda el protocolo de "jdbc:mysql".
import java.sql.SQLException; // 

public class Conexion {

  // Variables Secretas PF#2 - Componentes 
  /* // Cadena de conexion.
  Esto es una URL de conexion de JDBC, que es lo que significa cada una de las partes de la cadena: 
    
  */
  String url = "jdbc:mysql://localhost:3306/tienda_crud";
  String usuario = "root";
  String clave = "";

  public Connection conectar() { // PF#3 - Ejecutando 
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