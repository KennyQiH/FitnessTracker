import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Workout extends JFrame {
	private JTextField Type, Duration, Calories;
	private JTextArea Logs;
	private static ArrayList<String> Workouts = new ArrayList<>();

	public Workout() {
	  setTitle("Workout Log");
	  setSize(400,300);
	  setLayout(new GridLayout(5,2));
	  setLocationRelativeTo(null);
    
	  add(new JLabel("Exercise:"));
	  Type = new JTextField();
	  add(Type);
    
	  add(new JLabel("Duration:"));
	  Duration = new JTextField();
	  add(Duration);
	  
	  add(new JLabel("Calories Burned:"));
	  Calories = new JTextField();
	  add(Calories);
    
	  JButton logButton = new JButton("Log workout");
	  add(logButton);
    
	  Logs = new JTextArea(5,10);
	  add(new JScrollPane(Logs));
    
	  logButton.addActionListener(e -> LogWorkout());
	  
	  setVisible(true);
  }
  	private void LogWorkout() {
  		try {
  			String type = Type.getText().trim();
  			int duration = Integer.parseInt(Duration.getText().trim());
  			int calories = Integer.parseInt(Calories.getText().trim());
  			
  			String Workout = "Workout: " + Type.getText() + ", Duration: " + Duration.getText() + "minutes Calories Burned: " + Calories.getText();
  			Workouts.add(Workout);
  			Logs.setText(String.join("\n", Workouts));
  		} catch (NumberFormatException ex){
  			
  		}
  }
  	public static ArrayList<String> getWorkouts() {
  		return Workouts;
  }
}
