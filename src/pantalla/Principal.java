package pantalla;

import DBPack.DBClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel panel;
    private JTextField UserInput;
    private JTextField PassInput;
    private JTextField CorrInput;
    public JButton enviarButton;
    public String user, pswrd, corr;
    public Principal(DBClass DB) {
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = UserInput.getText();
                pswrd = PassInput.getText();
                corr = CorrInput.getText();

                if (user != null && pswrd != null && corr != null){
                    UserInput.setText("");
                    PassInput.setText("");
                    CorrInput.setText("");

                    // Aquí es donde envías los datos a la base de datos
                    DB.addUser(user, pswrd, corr);
                }
            }
        });
    }


    public void registro() {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(this.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

