## Property Management Program
A property management company manages individual properties they will build to rent, and charges them a management fee as the percentages of the monthly rental amount.
The properties cannot overlap each other, and each property must be within the limits of the management company’s plot.  Write an application that lets the user create a management company and add the properties managed by the company to its list. 
Assume the maximum number of properties handled by the company is 5.

## Concepts
•	Aggregation
•	Passing object to method
•	Array Structure	
•	Objects as elements of the Array
•	Processing array elements
•	Copy Constructor
•	Junit testing

## Data Element class – Property.java
The class Property will contain: 
1.	Instance variables for property name, city, rental amount, owner, and plot.  Refer to JavaDoc for the data types of each instance variable.
2.	toString method to represent a Property object. 
3.	Constructors and getter and setter methods.  Refer to Javadoc of the Property class.

## Data Element class – Plot.java
The class Plot will contain:
1.	Instance variables to represent the x and y coordinates of the upper left corner of the location, and depth and width to represent the vertical and horizontal extents of the plot.
2.	A toString method to represent a Plot object
3.	Constructors, Refer to Javadoc for Plot class.
4.	A method named overlaps that takes a Plot instance and determines if it is overlapped by the current plot.
5.	A method named encompasses that takes a Plot instance and determines if the current plot contains it.  Note that the determination should be inclusive, in other words, if an edge lies on the edge of the current plot, this is acceptable.

## Data Structure – 
An Array of Property objects to hold the properties that the management company handles. This array will be declared as an attribute of the ManagementCompany class.

## Data Manager class – ManagementCompany.java
This class should not have any output functionality (e.g., no GUI-related or printing related functionality), but should take input, operate on the data structure, and return values or set variables that may be accessed with getters.
It will contain instance variables of name, tax Id, management fee, MAX_PROPERTY (a constant set to 5) and an array named properties of Property objects of size MAX_PROPERTY, as well as two constants MGMT_WIDTH and MGMT_DEPTH, both set to 10; an attribute plot of type Plot that defines the plot of the ManagementCompany Class. Refer to Javadoc for more details.
The class ManagementCompany will contain the following methods in addition to get and set methods:
1.	Constructors (refer to Javadoc for more details)
2.	Method addProperty (3 versions):  
  - 2.1.	Method addProperty version 1:
  - 2.1.1.	Pass in a parameter of type Property object (calls Property copy constructor). It will add the copy of the Property object to the properties array. 
  - 2.2.	Method addProperty version 2:

  - 2.2.1.	Pass in four parameters of types:
   •	String propertyName, 
   •	String city, 
   •	double rent,  
   •	String ownerName. 
   
  - 2.2.2.	Calls Property 4-arg constructor.
  - 2.3.	Method addProperty version 3:
  - 2.3.1.	Pass in eight parameters of types: 
  
   •	String propertyName, 
   •	String city, 
   •	double rent,
   •	String ownerName,
   •	int x,
   •	int y,
   •	int width
   •	int depth. 

  - 2.3.2.	Calls Property 8-arg constructor.
  - 2.4.	addProperty methods will return the index of the array where the property is added.  If there is a problem adding the property, this method will return -1 if the array is full, -2 if the property is null, -3 if the plot for the property is not encompassed by the management company plot, or -4 if the plot for the property overlaps any other property’s plot.
 3.	Method totalRent– Returns the total rent of the properties in the properties array.
 4.	Method maxRentPropertyIndex- returns the index of the property within the properties array that has the highest rent amount. This method will be private.  
 5.	Method maxRentProp- Returns the highest rent amount of the property within the properties array. For simplicity assume that each "Property" object's rent amount is different.  This method should call the maxRentPropertyIndex method.
 6.	Method toString- returns information of ALL the properties within this management company by accessing the "Properties" array. The format is as following example:

## List of the properties for Alliance, taxID: 1235
- ______________________________________________________
- Property Name : Belmar.
- Located in Silver Spring.
- Belonging to:John Smith
- Rent Amount: 1200.0
- Property Name : Camden Lakeway
- Located in Rockville
- Belonging to:Ann Taylor
- Rent Amount: 2450.0
- Property Name : Hamptons
- Located in Rockville
- Belonging to:Rick Steves
- Rent Amount: 1250.0
- ______________________________________________________
		
      total management Fee: 294.0
