import java.awt.*;
import javax.swing.*;

public class FitnessGUI extends JFrame {
	//Variables
	private CardLayout Layout;
	private JPanel MainPanel;
	private Workout workout;
	private Goals goals;
	private Progress progress;
    //Layout for the window
	public FitnessGUI() {
		setTitle("Smart Fitness Tracker Menu");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,1));
		
		JLabel UserLabel = new JLabel("Welcome, " + UserSession.getCurrentUser());
		UserLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(UserLabel);

		JButton WorkoutButton = new JButton("Log Workout");
		JButton GoalButton = new JButton("Set Goal");
		JButton ProgressButton = new JButton("View Progress");

		add(WorkoutButton);
		add(GoalButton);
		add(ProgressButton);
    
		WorkoutButton.addActionListener(e -> new Workout());
		GoalButton.addActionListener(e -> new Goals());
		ProgressButton.addActionListener(e -> new Progress());
    
		setVisible(true);
  }	
}
