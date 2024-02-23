package DBPack;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBLog {
    public boolean checkLogin = false;
    public void LogUser(String usuario, String password){

        String url = "jdbc:mysql://localhost:3306/practicasql";
        String nombreDeUsuario = "root";
        String pass = "";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // Establece la conexión con la base de datos
            con = DriverManager.getConnection(url, nombreDeUsuario, pass); //establezco conexion con la base de datos

            String consulta = "SELECT * FROM usuario WHERE Usuario = ? AND Contraseña = ?"; //creo la consulta
            pstmt = con.prepareStatement(consulta); //inicializo la consulta

            pstmt.setString(1, usuario);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido " + rs.getString("Usuario"));
                checkLogin = true;
            } else {
                JOptionPane.showMessageDialog(null, "Algo ha sido incorrecto");
            }

            pstmt.close();
            con.close();
        }  catch (Exception e) {
            // Bloque de código para manejar errores
            System.out.println("Algo salió mal.");
            e.printStackTrace();
        }
    }
}
