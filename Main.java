import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Username: ");
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        JLabel label1 = new JLabel("Password: ");
        panel.add(label1);

        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);

        JButton button = new JButton("Login");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = passwordField.getText();

                if(username.equals("Akhilesh") && password.equals("akhil1509")){
                    JOptionPane.showMessageDialog(frame,"Login-Successful");
                } else {
                    JOptionPane.showMessageDialog(frame,"Invalid login credentials!");
                }
            }
        });
        frame.setVisible(true);
    }
}