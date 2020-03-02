import java.util.ArrayList;
import java.util.Collections;

public class PersonalCalendar {
	
	private ArrayList<Happening> calendar = new ArrayList<Happening>();
	
	public PersonalCalendar() {
		
	}
	
	public void addEvent(Happening event) {
		calendar.add(event);
		Collections.sort(calendar); 
		
	}
	
	
	public String toString() {
		String returnString = "";
			for (int i = 0; i < calendar.size(); i++) {
				returnString = returnString + calendar.get(i) + '\n';
			}
		
		return returnString;
	}
}


	
	
	
	

