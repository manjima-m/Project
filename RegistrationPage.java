import java.awt.*;
import java.awt.event.*;

public class RegistrationPage extends Frame implements ActionListener {
    // Declare components
    Label nameLabel, age,gender,dob,emailLabel,linkwithac,passwordLabel; //if selecetd as work or if hire ;
    TextField nameField, emailField, passwordField;
    Button registerButton, cancelButton;

    public RegistrationPage() {
        // Set up the frame
        setTitle("Registration Page");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        // Initialize components
        nameLabel = new Label("Name:");
        emailLabel = new Label("Email:");
        passwordLabel = new Label("Password:");
        age = new Label("Age");
        dob = new Label("DOB");
        

        
        nameField = new TextField();
        emailField = new TextField();
        passwordField = new TextField();
        passwordField.setEchoChar('*'); // Mask the password input

        registerButton = new Button("Register");
        cancelButton = new Button("Cancel");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        add(cancelButton);

        // Add action listeners
        registerButton.addActionListener(this);
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
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();

            // For demonstration, just print the registration info
            System.out.println("Registered: " + name + ", Email: " + email);
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}
