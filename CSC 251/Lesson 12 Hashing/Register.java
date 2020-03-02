import java.util.ArrayList;
import java.util.HashMap;


public class Register {

	public static void main(String[] args) {
		HashMap<Section, ArrayList<String>> roster = new HashMap<>();
		Section s1 = new Section("CSC", 151, 0001, "Sophie Charlotte", "Intro to Java");
		Section s2 = new Section("CSC", 151, 0001, "Sophie C", "Introduction to Java");
		Section s3 = new Section("CSC", 151, 0001, "S Charlotte", "Java Introduction");
		Section s4 = new Section("CSC", 151, 0002, "Sophie C", "Introduction to Java");
		Section s5 = new Section("DBA", 151, 0001, "Sophie Charlotte", "SQL 1");
		Section s6 = new Section("CSC", 251, 0001, "Sophie Charlotte", "Adv Java");
		
		registerAStudent(roster, s1, "sophie");
		registerAStudent(roster, s2, "sally");
		registerAStudent(roster, s3, "jack");
		registerAStudent(roster, s4, "lassie");
		registerAStudent(roster, s5, "freckles");
		registerAStudent(roster, s6, "zipper");
		
		System.out.println(roster);
	}
	
	public static void registerAStudent(HashMap<Section, ArrayList<String>> roll, Section s, String student) {
		ArrayList<String> victims = roll.get(s);
		if (victims == null) {
			victims = new ArrayList<>();
			victims.add(student);
		}
		else {
			victims.add(student);
		}
		roll.put(s,  victims);
	}

}
