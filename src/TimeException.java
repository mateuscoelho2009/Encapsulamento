public class TimeException extends Exception {
	// attributes
	private String type;
	
	// Constructor
	TimeException (String eType) {
		type = eType;
	}
	
	TimeException () {
		type = "Not Especified Time Error.";
	}
	
	// Methods
	public String toString () {
		return "Time Exception Error: " + type;
	}
}
