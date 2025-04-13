import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField Name, Age, Weight;

    public Login() {
        setTitle("Login/Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        setLocationRelativeTo(null);

        add(new JLabel("Name:"));
        Name = new JTextField();
        add(Name);
        
        add(new JLabel("Age:"));
        Age = new JTextField();
        add(Age);
        
        add(new JLabel("Weight"));
        Weight = new JTextField();
        add(Weight);
        
        JButton LoginButton = new JButton("Continue");
        add(LoginButton);

        LoginButton.addActionListener(e -> {
        	String name = Name.getText();
        	int age = Integer.parseInt(Age.getText());
        	double weight = Double.parseDouble(Weight.getText());
        	UserSession.setCurrentUser(new User(name, age, weight));
        	new FitnessGUI();
        	dispose();        	
        });

        setVisible(true);
    }
}
