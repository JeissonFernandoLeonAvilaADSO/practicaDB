package pantalla;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel panel;
    private JTextField UserInput;
    private JTextField PassInput;
    private JTextField CorrInput;
    private JButton enviarButton;
    public String user, pswrd, corr;
    public boolean check = false;
    public Principal() {
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = UserInput.getText();
                pswrd = PassInput.getText();
                corr = CorrInput.getText();

                if (user != null && pswrd != null && corr != null){
                    check = true;
                    UserInput.setText("");
                    PassInput.setText("");
                    CorrInput.setText("");
                    JOptionPane.showMessageDialog(null, "Datos guardados");
                }

            }
        });


    }

    public void registro() {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

