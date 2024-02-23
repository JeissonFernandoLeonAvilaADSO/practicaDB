package pantalla;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Elec {


    private JButton INICIARSESIONButton;
    private JButton LOGEARSEButton;
    private JPanel elec;
    public boolean IniCheck, LogCheck;

    public Elec(Principal pantalla, Login login) {
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IniCheck = true;
                LogCheck = false;
                pantalla.registro();


            }
        });
        LOGEARSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogCheck = true;
                IniCheck = false;
                login.login();
            }
        });
    }

    public void eleccion() {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(this.elec);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
