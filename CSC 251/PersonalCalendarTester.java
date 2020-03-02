import static org.junit.Assert.*;

import org.junit.Test;

public class PersonalCalendarTester {
	
	@Test
	public void testOne() {
		PersonalCalendar pct = new PersonalCalendar();
		Event et = new Event(2011, 9, 20, 20, 40, "Party", 120, "Home");
		Appointment at = new Appointment(2011, 9, 20, 10, 30, "MidTerm", 30);
		Event et2 = new Event(2011, 9, 20, 20, 40, "Studying", 120, "Home");
		pct.addEvent(et);
		
		pct.addEvent(at);
		
		pct.addEvent(et2);
		
		String returnString = pct.toString();
		assertEquals("Appointment: MidTerm on Thu Oct 20 10:30:00 EDT 2011 for 30 minutes. Everyone going: \nThere are no one going currently!\nEvent: Party at Home on Thu Oct 20 20:40:00 EDT 2011 for 120 minutes.\nEvent: Studying at Home on Thu Oct 20 20:40:00 EDT 2011 for 120 minutes.\n", returnString);
	}
	
	@Test
	public void testFour() {
		Event et = new Event(2001, 8, 20, 12, 35, "Meeting",30, "Office");
		String location = et.getLocation();
		assertEquals("Office", location);
	}
	
	@Test
	public void testFive() {
		Appointment at = new Appointment(2001, 8, 20, 12, 35, "Talking about Test", 30);
		String location = at.getDescription();
		assertEquals("Talking about Test", location);
	}
	
}
