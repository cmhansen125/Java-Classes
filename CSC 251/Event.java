public class Event extends Happening {
	
	private String location;
	
	public Event(int year, int month, int dayOfMonth, int hour, int minute, String description, int duration, String location) {
		super(year, month, dayOfMonth, hour, minute, description, duration);
		this.location = location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return "Event: " + getDescription() + " at " + getLocation() + " on " + getDate() + " for " + getDuration() + " minutes.";
	}
	
	
}
