package Conexion;

import java.sql.*;

public class conexion {

    String usuario = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost/inventario";

    public Connection conectar() {

        Connection estado = null;
        try {
            estado = DriverManager.getConnection(url, usuario, pass);
        } catch (Exception e) {
        }
        return estado;
    }
}
