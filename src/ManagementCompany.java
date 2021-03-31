/**
 * This class represents the management company object
 * 
 * @author Mark Kasule
 *
 */
public class ManagementCompany {

	private final int MAX_PROPERTY = 5; // maximum number of properties
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private double mgmFeePer; // management fee percentage
	private String name; // name of management company
	private Property[] properties; // An array of property objects
	private String taxID; // taxId of the management company
	private Plot plot = new Plot(); // Plot of the management company

	// CONSTRUCTORS

	public ManagementCompany() {
		name = "";
		taxID = "";
		plot = new Plot(0, 0, 10, 10); // default plot
		properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.plot = new Plot(0, 0, 10, 10); // default plot
		this.properties = new Property[MAX_PROPERTY];

	}

	/**
	 * 
	 * @param otherCompany deep copy of management object
	 */
	public ManagementCompany(ManagementCompany otherCompany) {
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		plot = otherCompany.plot;
		properties = otherCompany.properties;
	}

	/**
	 * Return the MAX_PROPERTY constant that represent the size of the "properties"
	 * array.
	 * 
	 * @return
	 */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	/**
	 * Creates a property object and adds it to the "properties" array, in a default
	 * plot.
	 * 
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return key
	 */
	public int addProperty(String name, String city, double rent, String owner) {
		// properties array
		Property[] objArray = new Property[MAX_PROPERTY];
		Plot objPlot = new Plot(plot); // default plot copy

		int key = 0;

		for (int i = 0; i < objArray.length; i++) {
			// add property to array
			objArray[i] = new Property(name, city, rent, owner);

			if (objArray.length == getMAX_PROPERTY()) {
				key = -1;
			} else if (objArray.equals(null)) {
				key = -2;
			} else if (objPlot.equals(null)) {
				key = -3;
			} else if (objPlot.overlaps(plot)) {
				key = -4;
			} else if (objArray[i].equals(null)) {
				key = i;
			}
		}

		return key;
	}

	/**
	 * Adds the property object to the "properties" array.
	 * 
	 * @param property
	 * @return
	 */
	public int addProperty(Property property) {
		// properties array
		Property[] objArray = new Property[MAX_PROPERTY];
		Plot objPlot = new Plot(plot); // default plot copy

		int key = 0;

		for (int i = 0; i < objArray.length; i++) {
			// add property to array
			objArray[i] = new Property(property.getPropertyName(), property.getCity(), property.getRentAmount(),
					property.getOwner());

			if (objArray.length == getMAX_PROPERTY()) {
				key = -1;
			} else if (objArray.equals(null)) {
				key = -2;
			} else if (objPlot.equals(null)) {
				key = -3;
			} else if (objPlot.overlaps(plot)) {
				key = -4;
			} else if (objArray[i].equals(null)) {
				key = i;
			}
		}

		return key;
	}

	/**
	 * Creates a property object and adds it to the "properties" array.
	 * 
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		// properties array
		Property[] objArray = new Property[MAX_PROPERTY];
		Plot objPlot = new Plot(x, y, width, depth); // new plot

		int key = 0;

		for (int i = 0; i < objArray.length; i++) {
			// create object
			objArray[i] = new Property(name, city, rent, owner);

			if (objArray.length == getMAX_PROPERTY()) {
				key = -1;
			} else if (objArray.equals(null)) {
				key = -2;
			} else if (objPlot.equals(null)) {
				key = -3; // plot values are empty/null
			} else if (objPlot.overlaps(new Plot(plot))) {
				key = -4; // new plot values are same as original values
			} else if (objArray[i].equals(null)) {
				key = i;
			}
		}

		return key;
	}

	/**
	 * This method accesses each "Property" object within the array "properties" and
	 * sums up the property rent and returns the total amount
	 * 
	 * @return rent
	 */
	public double totalRent() {

		// rent amount accumulator
		double rentTotal = 0;

		Property[] objArray = new Property[MAX_PROPERTY];

		// add property rent in array
		for (int i = 0; i < objArray.length; i++) {

			rentTotal += objArray[i].getRentAmount();
		}
		return rentTotal;
	}

	/**
	 * This method finds the property with the maximum rent amount and returns its
	 * toString result.
	 * 
	 * @return maxRent
	 */
	public double maxRentProp() {

		Property[] objArray = new Property[MAX_PROPERTY];
		int i; // index of property
		double maxRent = 0; // maxRent Holds maximum rent

		// check for property at max rent
		for (i = 1; i < objArray.length; i++) {

			if (objArray[i].getRentAmount() > objArray[0].getRentAmount())
				maxRent = objArray[i].getRentAmount();
		}
		return maxRent;
	}

	/**
	 * This method finds the index of the property with the maximum rent amount.
	 * 
	 * @return
	 */
	private int maxRentPropertyindex() {

		Property[] objArray = new Property[MAX_PROPERTY];
		int highestIndex = 0;
		int index = -1;
		int numOfHighIndex = -1;
		double maxRent = 0;

		for (int i = 1; i < objArray.length; i++) {

			// if rent is higher, count the index it is at
			if (objArray[index].getRentAmount() < objArray[0].getRentAmount()) {
				maxRent = objArray[index].getRentAmount();
				highestIndex++;
			}

			// check for index with property at max rent
			if (highestIndex > numOfHighIndex) {
				index++;
			}
		}

		return index;
	}

	/**
	 * returns the index of the property with max rent to other classes for access
	 * @return return 
	 */
	public int maxPropertyRentIndex() {

		return maxRentPropertyindex();
	}

	/**
	 * Displays the information of the property at index i
	 * 
	 * @param i i The index of the property within the array "properties"
	 * @return information of the property at index i
	 */
	private Property displayPropertyAtIndex(int i) {
		return new Property(properties[i]);
	}

	public Plot getPlot() {
		// TODO Auto-generated method stub
		return new Plot(plot);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/**
	 * Displays the information of all the properties in the "properties" array.
	 * 
	 * @return str all properties in an array
	 * 
	 */
	public String toString() {
		Property[] objArray = new Property[MAX_PROPERTY];
		Property client = new Property();
		for (int i = 0; i < objArray.length; i++) {
			System.out.println(client.toString());
		}

		String str = "List of the properties for " + name + ", taxID: " + taxID + "\n" + objArray + "\nTotal Man"
				+ (totalRent() * (mgmFeePer / 100));

		return str;

	}

}
