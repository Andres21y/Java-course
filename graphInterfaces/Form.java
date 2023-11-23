import javax.swing.*;

public class Form extends JFrame {
    private JLabel label1;

    public Form(){
        setLayout(null);
        label1 =new JLabel("Welcome");
        label1.setBounds(10, 20 , 200, 300);
        add(label1);
    }

    public static void main(String[] args) {
       Form form1 = new Form();
       form1.setBounds(0, 0, 400, 300);
       form1.setVisible(true);
       form1.setLocationRelativeTo(null);
    }


}
