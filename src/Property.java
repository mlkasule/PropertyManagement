import javafx.scene.layout.Region;

/**
 * This class represents the property object
 * 
 * @author Mark Kasule
 *
 */
public class Property {

	private String propertyName; // name of property
	private String city; // name of the city
	private String owner; // name of house owner
	private double rentAmount; // holds the plot object
	private Plot plot;

	/**
	 * no-arg constructor
	 */
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		this.plot = new Plot(0, 0, 1, 1); // default plot
	}

	/**
	 * constructor for the property object
	 * 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param plot
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x, y, width, depth); // deep copy
	}

	/**
	 * deep copy of property object
	 * 
	 * @param p
	 */
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}

	/**
	 * copy constructor without plot object
	 * 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
	}

	// METHODS
	/**
	 * sets the name of the property
	 * 
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * sets names of the city
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * sets owner names
	 * 
	 * @param owner
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * sets the rent amount
	 * 
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}

	/**
	 * method outputs name of property
	 * 
	 * @return propertyName
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * method outputs city name
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * methods outputs owner names
	 * 
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * methods outputs rent amount
	 * 
	 * @return rent amount
	 */
	public double getRentAmount() {
		return rentAmount;
	}

	/**
	 * 
	 * @return a plot copy
	 */
	public Plot getPlot() {
		// TODO Auto-generated method stub
		return new Plot(plot);
	}

	/**
	 * @return str string to display property details.
	 */
	public String toString() {
		String str = "Property Name: " + propertyName + "\n" + "Located in: " + city + "\n" + "Belonging to: " + owner
				+ "\n" + "Rent Amount: " + rentAmount + " ";
		return str;
	}

}
