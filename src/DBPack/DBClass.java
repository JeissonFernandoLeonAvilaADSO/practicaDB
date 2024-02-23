package DBPack;
import pantalla.Principal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBClass {
    public void addUser(){
        Principal datos = new Principal();
        String url = "jdbc:mysql://localhost:3306/practicasql";
        String nombreDeUsuario = "root";
        String pass = "";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // Establece la conexión con la base de datos
            con = DriverManager.getConnection(url, nombreDeUsuario, pass); //establezco conexion con la base de datos

            String consulta = "INSERT INTO usuario (Usuario, Contraseña, Correo) VALUES (?, ?, ?)"; //creo la consulta
            pstmt = con.prepareStatement(consulta); //inicializo la consulta


            pstmt.setString(1, datos.user);
            pstmt.setString(2, datos.pswrd);
            pstmt.setString(3, datos.corr);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");
            pstmt.close();
            con.close();
        }  catch (Exception e) {
            // Bloque de código para manejar errores
            System.out.println("Algo salió mal.");
            e.printStackTrace();
        }
    }
}
