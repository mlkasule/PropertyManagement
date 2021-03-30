/**
 * This class represents the plot object
 * 
 * @author casul
 *
 */
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;

	/**
	 * initiation of the object's values in a constructor
	 */
	public Plot() {
		x = 0; // not necessarily needed to be declared
		y = 0; // not necessarily needed to be declared
		width = 1;
		depth = 1;
	}

	/**
	 * copy constructor
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	/**
	 * deep copy of the plot object
	 * 
	 * @param p
	 */
	public Plot(Plot p) {
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;

	}

	// METHODS
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	public boolean overlaps(Plot p) {

		// make copy of original object to compare with passed object p
		Plot house = new Plot();
		
		boolean location;
		
		//should ise methods or direct x, y?
		if (house.x == p.x || house.y == p.y) {
			location = true;
		} else {
			location = false;
		}
		return location;
	}

	public boolean encompasses(Plot plot) {
		// add widith to the x and widht position to get edge?
	}

	public String toString() {
		String str = "Upper left: (" + x + "," + y + ") Width: " + width + " Depth: " + depth;

		return str;
	}

}
