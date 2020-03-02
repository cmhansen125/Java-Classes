import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooCoree  extends ArrayList<Animal>  {	
	 
	
	private File f = new File("Zoo.txt");
	
	 
	public  String addtoZoo(Animal z_animal)  {
		
		
		String results = null;
		
		 results = this.containsTag(z_animal.getTagNumber());
		 if(results== null) { 
		    this.add(z_animal);
		    results = "Animal added to zoo";
		    System.out.println("Animal added");
		
		     BufferedWriter bw = null;
		     try {
		    	 // APPEND MODE SET HERE
		    	 bw = new BufferedWriter(new FileWriter("Zoo.txt", true));
		    	 bw.write(z_animal.toString());
		    	 bw.newLine();
		    	 bw.flush();
		     } catch (IOException ioe) {
		    	 ioe.printStackTrace();
		     } finally {                       // always close the file
		         if (bw != null) try {
		        	 bw.close();
		         } catch (IOException ioe2) {
		    // just ignore it
		 
		 	} // end try/catch/finally
	      }
		}		 
		return results ;
	}
		
		  
	public void  addBulk(String animal) {
	    String[] z_animal;
	    
	    String a_name = "";
		  String c_lass = "";
		  String genus = "";
		  String group = "";
		  String order = "";
		  String family = "";
		  int height = 0;
		  int weight = 0;
		  String subExhibit = "";
		  String funFacts = "";
		  String status = "";
		  int tagNumber = 0; 
		  Animal temp1 = null;
	    
	    z_animal = animal.split(",");
	     a_name = z_animal[0];
		 c_lass = z_animal[1];
		 genus =z_animal[2];
		 group = z_animal[3];
		 order =z_animal[4];
		 family = z_animal[5];;
		height =  Integer.parseInt(z_animal[6]);
		weight =  Integer.parseInt(z_animal[7]);
		subExhibit = z_animal[8];
		funFacts = z_animal[9];
		status = z_animal[10]; 

		System.out.println("FunFacts"+ z_animal[9]);
		System.out.println("Status"+ z_animal[10]);
		System.out.println("TagNumber"+ z_animal[11]);
		tagNumber = Integer.parseInt(z_animal[11]);
		
		
		System.out.println(c_lass + "\n"); 
		if(c_lass.equals("Air")) {
			  temp1 = new AirAnimals (a_name,   c_lass,   group,   genus,   order,   family,   height,   weight,   subExhibit,   funFacts,  status, tagNumber);
		}else if(c_lass.equals("Water")) {
			  temp1 = new WaterAnimals (a_name,   c_lass,   group,   genus,   order,   family,   height,   weight,   subExhibit,   funFacts,  status, tagNumber);
			  System.out.println("Added"); 
		}else if (c_lass.equals( "Land"))  {
			  temp1 = new LandAnimals (a_name, c_lass,   group,   genus,   order,   family,   height,   weight,   subExhibit,   funFacts,  status, tagNumber);
		 System.out.println("Added");
		} 
	   
		 
		this.add(temp1);
		String results = this.addtoZoo(temp1);
		/*System.out.println(this.toString());*/
		 
		System.out.println(results);
	    
	}
	
	public String containsTag(int tag) {
		
		Animal z_animal;
		String results = "";
		for(int i = 0; i < size(); i++) {
			z_animal = this.get(i); 
			if(z_animal.getTagNumber() == tag) 
				results = "Animal already exists in zoo";			
			 
		}
		return results; 
	}
		
	 
	 
	 
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((z_animal == null) ? 0 : z_animal.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ZooCoree)) {
			return false;
		}
		ZooCoree other = (ZooCoree) obj;
		if (z_animal.getTagNumber() >0 ) {
			if (other.z_animal.getTagNumber() > 0) {
				return false;
			}
		} else if (!(z_animal.getTagNumber() ==  other.z_animal.getTagNumber())) {
			return false;
		}
		return true;
	}
	Animal z_animal;
 
	
	public void createZooInUI() throws IOException  {
		
		f = new File("Zoo.Txt");
    	if(!f.exists()) { 
    		writeZooFile();
    	}
    	f = new File("Zoo.Txt");
    	Scanner scan;
    	ArrayList<String> content = new ArrayList<>();
    	try {
    		scan = new Scanner(f);            
    		 
    		while (scan.hasNextLine()) {
    			String l = scan.nextLine();
    			this.addBulk(l);
    			System.out.println(l);
    			Scanner lineBust = new Scanner(l);
    			while (lineBust.hasNext()) {
    				content.add(lineBust.next());
    			}
    			lineBust.close();
    			content.add("\n");
    		
    		}
    		scan.close();      		 
    		
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	}
    }    	 
		 
	
	public void writeZooFile() throws IOException {
		
		FileWriter fw = new FileWriter(f);
		PrintWriter outfile = new PrintWriter(fw);
		outfile.print("");
		outfile.close();

	}
	
	public Animal getAnimalByTag(int tag) {
		
		Animal animal = null;
		
		for(int i = 0; i < this.size(); i++) {
			animal = this.get(i);
			if(animal.getTagNumber() == tag)
					return animal;		
		}
		return null;
		
	}
	
	public ArrayList<Animal> getAnimalsByAlpha(String letter) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		Animal z_animal;
		
		
		for(int i = 0; i < size(); i++) {
			z_animal = this.get(i); 
			System.out.println("Size = " + size() + "this" + i +  "\n"+ z_animal.toString());
			if(z_animal.getName().startsWith(letter)) {
				System.out.println("Animal: " + z_animal.getName());
					animals.add(z_animal);	
			}
		}
		 
		return animals;
	}
	
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
		Animal animal = null;
		 String textS = "Zoo\n";
		
		for(int i = 0; i < this.size(); i++) {
			animal = this.get(i);		 
			textS += "[" + animal.toString() + "]\n"; 
		}	
		return textS;
	}
	
	/**
	 * Generate string for display purposes 
	 * @return
	 */
	public String toDisplay() {
		
		Animal animal = null;
		 String textS = "Zoo\n";
		
		for(int i = 0; i < this.size(); i++) {
			animal = this.get(i);		 
			textS += "[" + animal.toDisplay() + "]\n"; 
		}	
		return textS;
	}

	public ArrayList<Animal> getAnimalsByGroup(String group) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		Animal z_animal;
		
		
		for(int i = 0; i < size(); i++) {
			z_animal = this.get(i); 
			System.out.println("Size = " + size() + "this" + i +  "\n"+ z_animal.toString());
			if(z_animal.getGroup().equals(group)) {
				System.out.println("Animal: " + z_animal.getName());
					animals.add(z_animal);	
			}
		}
		 
		return animals;
	}
    
    public ArrayList<Animal> getAnimalsBySubExhibit(String subex) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		Animal z_animal = null;
		
		for(int i = 0; i < this.size(); i++) {
			z_animal = this.get(i);
			if(z_animal.getSubExhibit().equals(subex))
					animals.add(z_animal);		
		}
		return animals;
	}
    
    public ArrayList<Animal> getAnimalsByClass(String a_class) {
		
    	ArrayList<Animal> animals = new ArrayList<>();
		Animal z_animal;
		
		
		for(int i = 0; i < size(); i++) {
			z_animal = this.get(i); 
			/*System.out.println("Size = " + size() + "this" + i +  "\n"+ z_animal.toString());*/
			if(z_animal.getC_lass().equals(a_class)) {
				/*System.out.println("Animal: " + z_animal.getName()); */
					animals.add(z_animal);	
			}
		}
		 
		return animals;
	}
	 
}
	
 