import javax.swing.*;
import java.awt.event.*;

public class Form3 extends JFrame implements ActionListener {
    private JLabel label1;
    private JLabel label2;
    private JButton button1;

    public Form3() {
        setLayout(null);

        label1 = new JLabel("Interfaz gráfica");
        label1.setBounds(10, 20, 300, 30);
        add(label1);

        label2 = new JLabel("Version 1.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);

        button1 = new JButton("close");
        button1.setBounds(300, 250, 100, 30);
        add(button1);

        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Form3 form3 = new Form3();
        Form3 form32 = new Form3();

        form3.setBounds(0, 0, 300, 200);
        form3.setResizable(false);
        form3.setVisible(true);
        form3.setLocationRelativeTo(null);

        form32.setBounds(0, 0, 450, 350);
        form32.setResizable(false);
        form32.setVisible(true);
        form32.setLocationRelativeTo(null);
    }
}
