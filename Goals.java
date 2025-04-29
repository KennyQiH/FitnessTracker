import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Goals extends JFrame {
	//Variables
	private JTextField goalField;
	private JTextArea ListArea;
	private static ArrayList<String> goals = new ArrayList<>();
	//Layout of the window
	public Goals() {
		setTitle("Set Goals");
		setSize(400,300);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		//A panel which handles the data given
		JPanel Inputs = new JPanel(new GridLayout(1,2));
		goalField = new JTextField();
		Inputs.add(goalField);
		//Adding goals
		JButton GoalsButton = new JButton("Set Goal");
		Inputs.add(GoalsButton);
		
		add(Inputs, BorderLayout.NORTH);
		//Recently created goals shown
		ListArea = new JTextArea();
		add(new JScrollPane(ListArea), BorderLayout.CENTER);
		//Removing the last goal created
		JButton DeleteGoal = new JButton("Remove last Goal");
		add(DeleteGoal, BorderLayout.SOUTH);
		
		GoalsButton.addActionListener(e -> setGoals());
		DeleteGoal.addActionListener(e -> removeGoals());
		
		updateGoalList();
		
		setVisible(true);
	}
	//The code for this window
	private void setGoals() {
		String goal = goalField.getText().trim();
		//A negative feedback
		if (!goal.isEmpty()) {
			goals.add(goal);
			updateGoalList();
			goalField.setText("");
		} else {
			JOptionPane.showMessageDialog(this, "Goal cannot be emtpy");
		}

	}
	//A negative feedback to check the following conditions
	private void removeGoals() {
		if (!goals.isEmpty()) {
		goals.remove(goals.size() -1);
		updateGoalList();
		} else {
			JOptionPane.showMessageDialog(this, "There is no gols to remove");
		}
	}
	
	private void updateGoalList() {
        ListArea.setText(String.join("\n", goals));
    }
	
	public static ArrayList<String> getGoals() {
		return goals;
	}
}
