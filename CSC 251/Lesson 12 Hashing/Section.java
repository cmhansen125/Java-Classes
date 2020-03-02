
public class Section {

	private String department;
	private int courseNumber;
	private int sectionNumber;
	private String instructor;
	private String title;
	
	public Section(String d, int c, int s, String i, String t) {
		department = d;
		courseNumber = c;
		sectionNumber = s;
		instructor = i;
		title = t;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseNumber;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + sectionNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Section other = (Section) obj;
		if (courseNumber != other.courseNumber) {
			return false;
		}
		if (department == null) {
			if (other.department != null) {
				return false;
			}
		} else if (!department.equals(other.department)) {
			return false;
		}
		if (sectionNumber != other.sectionNumber) {
			return false;
		}
		return true;
	}
}
