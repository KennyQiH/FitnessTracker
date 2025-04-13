import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Goals extends JFrame {
	private JTextField goalField;
	private JTextArea ListArea;
	private static ArrayList<String> goals = new ArrayList<>();
	
	public Goals() {
		setTitle("Set Goals");
		setSize(400,300);
		setLayout(new GridLayout(3,1));
		setLocationRelativeTo(null);
		
		add(new JLabel("Set a new goal"));
		goalField = new JTextField();
		add(goalField);
		
		JButton GoalsButton = new JButton("Set Goal");
		add(GoalsButton);
		
		ListArea = new JTextArea(5,10);
		add(new JScrollPane(ListArea));
		
		GoalsButton.addActionListener(e -> setGoals());
		
		setVisible(true);
	}
	private void setGoals() {
		String goal = goalField.getText();
		goals.add(goal);
		ListArea.setText(String.join("\n", goals));
	}
	public static ArrayList<String> getGoals() {
		return goals;
	}
}
