import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Workout extends JFrame {
	//Creates the variables
	private JTextField Type, Duration, Calories;
	private JTextArea Logs;
	private static ArrayList<String> Workouts = new ArrayList<>();

	//Layout of the window
	public Workout() {
	  setTitle("Workout Log");
	  setSize(400,300);
	  setLayout(new GridLayout(5,2));
	  setLocationRelativeTo(null);
    
	  add(new JLabel("Exercise:"));
	  Type = new JTextField("Bench Press");
	  add(Type);
    
	  add(new JLabel("Duration (in minutes):"));
	  Duration = new JTextField("30");
	  add(Duration);
	  
	  add(new JLabel("Calories Burned:"));
	  Calories = new JTextField("100");
	  add(Calories);
    
	  JButton logButton = new JButton("Log workout");
	  add(logButton);
    
	  Logs = new JTextArea(5,10);
	  add(new JScrollPane(Logs));
    
	  logButton.addActionListener(e -> LogWorkout());
	  
	  setVisible(true);
  }
	//The code for this window
  	private void LogWorkout() {
  		//creating a negative response for invalid inputs
  		try {
  			String type = Type.getText().trim();
  			String durationText = Duration.getText().trim();
  			String caloriesText = Calories.getText().trim();
  			
  			if (type.isEmpty() || durationText.isEmpty() || caloriesText.isEmpty()) {
  				JOptionPane.showMessageDialog(this, "All fields must be filled out");
  				return;
  			}
  			//assigning integer values so it can check whether if it is a number
  			int duration = Integer.parseInt(durationText);
  			int calories = Integer.parseInt(caloriesText);
  			
  			if (duration < 0 || calories < 0) {
  				JOptionPane.showMessageDialog(this, "Must be a positive value");
  				return;
  			}
  			//Format of the response
  			String Workout = "Workout: " + type + ", Duration: " + duration + "minutes Calories Burned: " + calories;
  			Workouts.add(Workout);
  			Logs.setText(String.join("\n", Workouts));
  		} catch (NumberFormatException ex){
  			JOptionPane.showMessageDialog(this, "Invalid Duration or Calories Burned input, please re-enter.");
  		}
  }
  	public static ArrayList<String> getWorkouts() {
  		return Workouts;
  }
}
