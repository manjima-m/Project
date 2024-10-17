import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends Frame {
    TextField usernameField, passwordField;
    Button loginButton;

    public LoginPage() {
        setTitle("Login Page");
        setSize(300, 300);
        setLayout(new FlowLayout());

        usernameField = new TextField(20);
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        loginButton = new Button("Login");

        add(new Label("Username:"));
        add(usernameField);
        add(new Label("Password:"));
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(e -> loginUser());

        setVisible(true);
    }

    private void loginUser() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String jsonInput = String.format("{\"username\":\"%s\", \"password\":\"%s\"}", username, password);

        try {
            String response = HttpRequest.post("http://localhost:8080/api/user/login", jsonInput);
            JOptionPane.showMessageDialog(this, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
