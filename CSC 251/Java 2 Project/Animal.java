
/**
 * Interface for LandAnimal, AirAnimal and WaterAnimal - 3 of the 6 classes of Animals.
 * The other 3 classes have not been implemented.
 *
 */
public interface Animal {	
	
	public void setName(String a_name);
	
	public String getName();
 
	public void setC_lass(String c_lass);
	
	public String getC_lass();

	public void setGenus(String genus);

	public String getGenus();
	
	public void setGroup(String group);

	public String getGroup();
	
	
	public void setOrder(String order);

	public String getOrder();
	
	public void setFamily(String family);

	public String getFamily();
	
	public void setHeight(int height);

	public int getHeight();
	
	public void setWeight(int Weight); 

	public int getWeight(); 
	
	public void setSubExhibit(String subexhibit);  
	
	public String getSubExhibit(); 

	public void setFunfacts(String funfacts); 
	
	public String getFunfacts(); 
	
	public void setStatus(String status);	
	
	public String getStatus();
	
	public void setTagNumber(int tag);
	 
	public int getTagNumber();  
	 
 
	void update(String a_name, String c_lass, String genus, String order, String family, int height, int weight,
			String subExhibit, String funFacts, String status, int tagNumber);
  
	
	
	public boolean update(Animal animaltoupdate);
	

	/**
	 * Generate string for display purposes 
	 * @return
	 */
	public String toDisplay(); 

	 
	 

	 

}
