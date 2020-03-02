import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exhibit  {
	
	
	String[] subexhibit;  /* can be changed to incorporate a subexhibit object */
	ArrayList<Integer>  exhibitlist = null; /* tag numbers of animals in the exhibits */
	
	
	/* create the exhibit */
	 public Exhibit(String[] subexhibit, String exhibitname) {
	    this.subexhibit = subexhibit; 	 
	    /*createExhibit(exhibitname, subexhibit);*/
    } 
	 private File f = new File("Animals.Txt");
	 
	 private void createExhibit(String exhibitname, String[] subexhibit)  {
		 if(!f.exists()) {
			    try {
					FileReader fR =  new FileReader(exhibitname);
					FileWriter fw = new FileWriter(f);
					 PrintWriter outfile = new PrintWriter(fw); 
						for(int i = 0; i < subexhibit.length; i++) {
							outfile.print(subexhibit[i] +  ",");
						}
						outfile.print("\n");
						outfile.close();
						fR.close();
					 
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
		 }
	 
	 }
	
	/**
	 * Add tag number of animal to exhibit
	 * @param tag
	 * @return 
	 */
	public void add(int tag) {
		
		this.exhibitlist.add(tag); 
	}
		 
 
	/**
	 * Remove tag number of animal to exhibit
	 * Return -1 if no tag found
	 * @param tag
	 */
	public int  remove(int tag) {
		
		int temptag = 0;
		
		for(int i = 0; i < this.exhibitlist.size(); i ++)
			
		      this.exhibitlist.get(temptag); 
			if(tag == temptag)
				this.exhibitlist.remove(temptag);
			else
				return -1;
		return 1;
	}
 
	
	
	
	/**
	 * 
	 * @param exhibitName
	 * @param tag
	 * @throws IOException
	 */
	public void writeToFile(String exhibitName, int tag) throws IOException {		
		 
		
		if(!f.exists()) { 
		    FileReader fR =  new FileReader(exhibitName);
		FileWriter fw = new FileWriter(f);
		PrintWriter outfile = new PrintWriter(fw);
		outfile = new PrintWriter(fw);
		outfile.print(exhibitName + "\n");
	 
	 
		}
	}

 

}
