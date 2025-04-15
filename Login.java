import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	//Variables
    private JTextField Name, Age, Weight;
    //Layout and code for this window
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
        //Creating negative feedback for invalid inputs
        LoginButton.addActionListener(e -> {
        	try {
        		String name = Name.getText().trim();
        		String ageText = Age.getText().trim();
        		String weightText = Weight.getText().trim();
        		
        		if (name.isEmpty() || ageText.isEmpty() || weightText.isEmpty()) {
        			JOptionPane.showMessageDialog(this, "All fields must be filled");
        			return;
        		}
        		
        		int age = Integer.parseInt(Age.getText());
            	double weight = Double.parseDouble(Weight.getText());
            	UserSession.setCurrentUser(new User(name, age, weight));
            	new FitnessGUI();
            	dispose();
            	
        	} catch (NumberFormatException ex) {
        		JOptionPane.showMessageDialog(this, "Invalid Age and Weight input, please try again");
        	}
        });

        setVisible(true);
    }
}
