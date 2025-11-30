/* 
public class App { // C de Create del CRUD
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // 1. Creamos un objeto de la clase Conexion
    // 2. Llamamos al método
    Conexion miConexion = new Conexion();
    Connection con = miConexion.conectar();
    
    String sql = "INSERT INTO Productos (nombre_producto, descripcion_producto, precio_producto) VALUES (?, ?, ?)";

    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "Coca-cola");
        pst.setString(2, "Refresco 600ml");
        pst.setDouble(3, 18.50);

        pst.executeUpdate();
        System.out.println("Producto guardado con exito!");
    } catch (Exception e) {
      System.out.println("Error al guardar el nuevo producto " + e);
    }

  }
}
 */

public class App { // R de Read del CRUD
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    // 1. Creamos un objeto de la clase Conexion
    // 2. Llamamos al método
    Conexion miConexion = new Conexion();
    Connection con = miConexion.conectar();
    
    String sql = "SELECT * FROM productos WHERE id_producto = 1";

    try {
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      System.out.println("--- LISTA DE PRODUCTOS ---");

      while (rs.next()) {
        // Sacamos los datos de las columnas por su nombre
        int id = rs.getInt("id_producto");
        String nombre = rs.getString("nombre_producto");
        double precio = rs.getDouble("precio_producto");

        // Los imprimimos bonito
        System.out.println(id + " | " + nombre + " | $" + precio);
      }

    } catch (Exception e) {
      System.out.println("Error al listar: " + e);
    }

  }
}  


/* public class App { // D de Delete del CRUD
    public static void main(String[] args) {
      
    }
  } */