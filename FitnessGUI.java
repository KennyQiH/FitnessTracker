import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FitnessGUI extends JFrame {
	private CardLayout Layout;
	private JPanel MainPanel;
	private Workout workout;
	private Goals goals;
	private Progress progress;
  
	public FitnessGUI() {
		setTitle("Smart Fitness Tracker Menu");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,1));

		JButton WorkoutButton = new JButton("Log Workout");
		JButton GoalButton = new JButton("Set Goal");
		JButton ProgressButton = new JButton("View Progress");

		add(WorkoutButton);
		add(GoalButton);
		add(ProgressButton);
    
		/*add(Navigator, BorderLayout.NORTH);
    
		Layout = new CardLayout();
		MainPanel = new JPanel();
    
		workout = new Workout();
		goals = new Goals();
		progress = new Progress(workout, goals);
    
		MainPanel.add(workout, "Workout");
		MainPanel.add(goals, "Goals");
		MainPanel.add(progress, "Progress");
    
		add(MainPanel, BorderLayout.CENTER);*/
    
		WorkoutButton.addActionListener(e -> new Workout());
		GoalButton.addActionListener(e -> new Goals());
		ProgressButton.addActionListener(e -> new Progress());
    
		setVisible(true);
  }	
}
