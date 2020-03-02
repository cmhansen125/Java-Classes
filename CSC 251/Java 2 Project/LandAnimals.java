
/**
 * LandAnimals class implements Animal interface
 *
 */
public  class LandAnimals implements Animal {

	private String a_name;
	private String c_lass;
	private String genus;
	private String order;
	private String group;
	private String family;
	private int height;
	private int weight;
	private String subExhibit;
	private String funFacts;
	private String status;
	private int tagNumber;
	
	public LandAnimals(String a_name, String c_lass, String genus, String order, String group, String family,  int height, int weight, String exhibit, String funFacts, String status, int tag) {
		this.a_name = a_name;
		this.c_lass = c_lass;
		this.genus = genus;
		this.order = order;
		this.group = group;
		this.family = family; 
		this.height = height;
		this.weight = weight;
		this.subExhibit = exhibit;
		this.funFacts = funFacts;
		this.status = status;
		this.tagNumber = tag;
	}
	
	public void setName(String a_name) {
		// TODO Auto-generated method stub		
	}
	public String getName() { 
		return this.a_name;
	}
	
	public void setC_lass(String c_lass) {
		this.c_lass = c_lass;
	}
	public String getC_lass() {
		return c_lass;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getGenus() {
		return genus;
	}
	
	public void setOrder(String order) {
		this.order = order;
	}
	public String getOrder() {
		return order;
	}
	
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void setFamily(String family) {
		this.family = family;
	}
	public String getFamily() {
		return family;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	public void setWeight(int Weight) {
		this.weight = Weight;
	}
	public int getWeight() {
		return weight;
	}
	
	public void setSubExhibit(String subExhibit) {
		this.subExhibit = subExhibit;
	}
	public String getSubExhibit() {
		return subExhibit;
	}

	public void setFunfacts(String funfacts) {
		this.funFacts = funfacts;
	}
	public String getFunfacts() {
		return funFacts;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	
	public void setTagNumber(int tagNumber) {
		this.tagNumber = tagNumber;
	}
	public int getTagNumber() {
		return tagNumber;
	}		 

	  

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LandAnimals [a_name=" + a_name + ", c_lass=" + c_lass + ", genus=" + genus + ", order=" + order
				+ ", group=" + group + ", family=" + family + ", height=" + height + ", weight=" + weight
				+ ", subExhibit=" + subExhibit + ", funFacts=" + funFacts + ", status=" + status + ", tagNumber="
				+ tagNumber + "]";
	}

	@Override
	public void update(String a_name, String c_lass, String genus, String order, String family, int height, int weight,
			String subExhibit, String funFacts, String status, int tagNumber) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean update(Animal animaltoupdate) {
		// TODO Auto-generated method stub
		return false;
	} 
	
	/**
	 * Generate string for display purposes 
	 * @return
	 */
	public String toDisplay() {
		 
		 String textS = "Zoo\n";	  
		 
		 
		     textS = this.getName() +  "\n";
		     textS += "Family: " + this.getFamily() + "Order: " + this.getOrder() + "Genus: " + this.getGenus() + "\n";
		     textS +=  "Fun Facts" + this.getFunfacts() + "\n"; 
		 	
		     return textS;
	}
	 
}
