import java.util.Date;
import java.util.GregorianCalendar;

abstract class Happening implements Comparable<Happening>{
	private GregorianCalendar date;
	private String description;
	private int duration;
	
	public Happening(int year, int month, int dayOfMonth, int hour, int minute, String description, int duration) {
		date = new GregorianCalendar(year, month, dayOfMonth, hour, minute);
		this.description = description;
		this.duration = duration;
	}
	
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}	
		
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Date getDate() {
		return date.getTime();
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String toString() {
		String returnString = "Appointment: " + getDescription() + " on " + getDate() + " for " + getDuration() + " minutes. Everyone going: \n";
		
		return returnString;
	}

	@Override
	public int compareTo(Happening o) {
		int compare = getDate().compareTo(o.getDate());
		if (compare == 0) {
			int compareDescribe = getDescription().compareTo(o.getDescription());
			return compareDescribe;
		} else {
			return compare;
		}
	}

}
