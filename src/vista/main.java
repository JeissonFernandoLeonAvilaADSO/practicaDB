package vista;
import DBPack.DBClass;
import pantalla.Principal;


public class main {

    public static void main(String[] args) {
        Principal pantalla = new Principal();
        DBClass DB = new DBClass();

        pantalla.registro();

        if (pantalla.check){
            DB.addUser();
        }
    }
}

