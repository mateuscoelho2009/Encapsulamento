
public class Time {
	// attributes
	private int hour, minute;
	
	// Constructors
	Time () {
		clear();
	}
	
	Time (int hour, int minute) throws TimeException {
		
		changeHour(hour);
		changeMinute(minute);
	}
	
	// Methods
	private void clear() {
		try {
			changeHour(0);
			changeMinute(0);
		} catch (TimeException te) {
			System.err.println("This error was not supposed to be happening: " + te);
		}
	}
	
	public void changeHour (int hour) throws TimeException {
		if (hour < 24 && hour >= 0)
			this.hour = hour;
		else
			throw new TimeException("Invalid Hour");
	}
	
	public void changeMinute (int minute) throws TimeException {
		if (minute < 60 && minute >= 0)
			this.minute = minute;
		else
			throw new TimeException("Invalid Minute");
	}
	
	private int getHour() {
		return hour;
	}
	
	private int getMinute() {
		return minute;
	}
	
	@Override
	public String toString () {
		return getHour() + ":" + getMinute();
	}
}
