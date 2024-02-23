package vista;
import DBPack.DBClass;
import pantalla.Principal;


public class main {
    public static void main(String[] args) {
        DBClass DB = new DBClass();
        Principal pantalla = new Principal(DB);

        pantalla.registro();


    }
}

