package pantalla;

import DBPack.DBLog;
import pantalla.exito;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField UserInput;
    private JTextField PasswordInput;
    private JButton INICIARSESIONButton;
    private JPanel log;
    public String user, pswrd;


    public Login(DBLog DBLg) {
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exito exito = new exito();
                user = UserInput.getText();
                pswrd = PasswordInput.getText();

                if (user != null && pswrd != null) {
                    UserInput.setText("");
                    PasswordInput.setText("");

                    DBLg.LogUser(user, pswrd);
                    if (DBLg.checkLogin){
                        exito.exito();
                    }

                }    // Aquí es donde envías los datos a la base de datos
            }
        });
    }

    public void login() {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(this.log);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
