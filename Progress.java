import javax.swing.*;
import java.awt.*;

public class Progress extends JFrame {
	private JTextArea ProgressArea;
	
	
	public Progress() {
		setTitle("Progress Report");
		setSize(500,400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		ProgressArea = new JTextArea();
		ProgressArea.setEditable(false);
		add(new JScrollPane(ProgressArea), BorderLayout.CENTER);
		
		JButton ProgressButton = new JButton("Generate Prgoress");
		add(ProgressButton, BorderLayout.SOUTH);
		
		ProgressButton.addActionListener(e -> generateProgress());
		
		setVisible(true);
	}
	
	private void generateProgress() {
		StringBuilder progress = new StringBuilder();
		User user = UserSession.getCurrentUser();
		progress.append("=== Fitness Progress " + user.getname() + "===\n");
		progress.append("Age: " + user.getage() + ", Weight: " + user.weight() + " kg\n\n");
		progress.append("Goals:\n");
		
		for (String goal : Goals.getGoals()) {
			progress.append("- ").append(goal).append("\n");
		}
		
		progress.append("\nWorkouts:\n");
		
		for (String workout : Workout.getWorkouts()) {
			progress.append("- ").append(workout).append("\n");
		}
		
		ProgressArea.setText(progress.toString());
	}
}
