package vista;
import DBPack.DBClass;
import DBPack.DBLog;
import pantalla.Elec;
import pantalla.Login;
import pantalla.Principal;
import pantalla.exito;

import javax.swing.*;


public class main {
    public static void main(String[] args) {
        DBClass DB = new DBClass();
        DBLog DBLg = new DBLog();
        Principal pantalla = new Principal(DB);
        Login login = new Login(DBLg);
        Elec elec = new Elec(pantalla, login);

        elec.eleccion();



    }
}

