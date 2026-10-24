import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shop Management Login");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 100, 25);

        JTextField username = new JTextField();
        username.setBounds(130, 30, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 100, 25);

        JPasswordField password = new JPasswordField();
        password.setBounds(130, 70, 150, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 120, 100, 30);

        loginButton.addActionListener(e -> {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect username or password!");
            }
        });

        frame.add(userLabel);
        frame.add(username);
        frame.add(passLabel);
        frame.add(password);
        frame.add(loginButton);

        frame.setSize(350, 220);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}