public class User {
	  private String name;
	  private int age;
	  private double weight;
	  
	  public User(String name, int age, double weight) {
		  this.name = name;
		  this.age = age;
		  this.weight = weight;
	  }
	  
	  /*Getters for the user attributes
	   * if the variables were to be called
	     elsewhere */
	  public String getname() {
		  return name;
	  }
	  
	  public int getage() {
		  return age;
	  }
	  
	  public double weight() {
		  return weight;
	  }
	  
	  //Override
	  public String toString() {
		  return name;
	  }
}
