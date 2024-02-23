package pantalla;

import javax.swing.*;

public class exito {
    private JPanel panel1;

    public void exito(){
        JFrame frame = new JFrame("exito");
        frame.setContentPane(new exito().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
