/**
 * Program to test ZipUnzip
 * 
 * @author Coree Hansen
 */

public class ZipUnzipTest {

	/**
	* This method calls upon ZipUnzip.java and tests the compress and decompress
	* method using given parameters.
	* @param args command line arguments (not used)
	*/	

  public static void main(String[] args) {
  
	String word = ZipUnzip.compress("reaction");
	System.out.println("\nExpected: @act&\n  Actual: " + word);
    
	word = ZipUnzip.compress("renderer");
	System.out.println("\nExpected: @nderer\n  Actual: " + word);
    
	word = ZipUnzip.compress("therefore");
	System.out.println("\nExpected: ~@fore\n  Actual: " + word);
    
	word = ZipUnzip.compress("there");
    	System.out.println("\nExpected: ~@\n  Actual: " + word);
	
	word = ZipUnzip.compress("react");
	System.out.println("\nExpected: @act\n  Actual: " + word);
	
	word = ZipUnzip.compress("conman");
	System.out.println("\nExpected: $m%\n  Actual: " + word);
	
	word = ZipUnzip.compress("contain");
	System.out.println("\nExpected: $tain\n  Actual: " + word);
	
	word = ZipUnzip.compress("recon");
	System.out.println("\nExpected: @$\n  Actual: " + word);


	word = ZipUnzip.decompress("@act&");
	System.out.println("\nExpected: reaction\n  Actual: " + word);
    
	word = ZipUnzip.decompress("@nderer");
	System.out.println("\nExpected: renderer\n  Actual: " + word);
    
	word = ZipUnzip.decompress("~@fore");
	System.out.println("\nExpected: therefore\n  Actual: " + word);
    
	word = ZipUnzip.decompress("$m%");
	System.out.println("\nExpected: conman\n  Actual: " + word);
    
	word = ZipUnzip.decompress("comp@ss");
	System.out.println("\nExpected: compress\n  Actual: " + word);
    
	word = ZipUnzip.decompress("@act#");
	System.out.println("\nExpected: reacting\n  Actual: " + word);
    
	word = ZipUnzip.decompress("$at&");
	System.out.println("\nExpected: conation\n  Actual: " + word);
    
	word = ZipUnzip.decompress("l&");
	System.out.println("\nExpected: lion\n  Actual: " + word);
    
  
    
	String line = ZipUnzip.compressLine("today is the first day of the rest of your life.");
	System.out.println("\nExpected: today is ~ first day of ~ @st of your life. \n  Actual: " + line);
    
	line = ZipUnzip.compressLine("the troops were given rations on an ongoing basis.");
	System.out.println("\nExpected: ~ troops we@ given rat&s on % ongo# basis.\n  Actual: " + line);
	
	line = ZipUnzip.compressLine("the constant flow of energy provided necessary lighting.");
	System.out.println("\nExpected: ~ $st%t flow of energy provided necessary light#.\n  Actual: " + line);
    
    
	line = ZipUnzip.decompressLine("today is ~ first day of ~ @st of your life.");
	System.out.println("\nExpected: today is the first day of the rest of your life. \n  Actual: " + line);
	
	line = ZipUnzip.decompressLine(" ~ troops we@ given rat&s on % ongo# basis.");
	System.out.println("\nExpected: the troops were given rations on an ongoing basis.\n  Actual: " + line);
	
	line = ZipUnzip.decompressLine("~ $st%t flow of energy provided necessary light#.");
	System.out.println("\nExpected: the constant flow of energy provided necessary lighting.\n  Actual: " + line);
    
 
    
   }
}