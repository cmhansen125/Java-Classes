import java.util.ArrayList;

public class Appointment extends Happening {
	
	private ArrayList<String> attendees = new ArrayList<String>();
		
	public Appointment(int year, int month, int dayOfMonth, int hour, int minute, String description, int duration) {
		super(year, month, dayOfMonth, hour, minute, description, duration);
	}
	
	protected void add(String attendee) {
		attendees.add(attendee);
	}
	
	public String toString() {
		String returnString = "Appointment: " + getDescription() + " on " + getDate() + " for " + getDuration() + " minutes. Everyone going: \n";
		if (attendees.isEmpty()) {
			returnString += "There are no one going currently!";
		} else { 
			for (int i = 0; i < attendees.size(); i++) {
				returnString += attendees.get(i) + "\n";
			}
		}
		return returnString;
	}
	
}

	
	
