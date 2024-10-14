import java.awt.*;
import java.awt.event.*;

public class LoginPage extends Frame implements ActionListener {
    // Declare components
    Label usernameLabel, passwordLabel;
    TextField usernameField, passwordField;
    Button loginButton, cancelButton;

    public LoginPage() {
        // Set up the frame
        setTitle("Login Page");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        // Initialize components
        usernameLabel = new Label("Username:");
        passwordLabel = new Label("Password:");
        usernameField = new TextField();
        passwordField = new TextField();
        passwordField.setEchoChar('*'); // Mask the password input
        loginButton = new Button("Login");
        cancelButton = new Button("Cancel");

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(cancelButton);

        // Add action listeners
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // Set visibility and close operation
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = passwordField.getText();
            // Validate credentials (simple example)
            if ("admin".equals(username) && "password".equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials!");
            }
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
