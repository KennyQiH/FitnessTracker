import javax.swing.*;
/*This class chooses which class to run first as each
 * class has a window in the code*/
public class FitnessTracker {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(Login::new);
  }
}
