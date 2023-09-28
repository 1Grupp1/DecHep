import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel jsHepDecCalc;
    private JTextField textField1;
    private JButton buttonHeptathlon;
    private JPanel MainPanel;
    private JButton buttonDecathlon;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Heptathlon and Decathlon Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        buttonHeptathlon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(Main.this, "Heptathlon " + firstName);
            }
        });
        buttonDecathlon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = textField1.getText();
                JOptionPane.showMessageDialog(Main.this, "Decathlon " + firstName);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
