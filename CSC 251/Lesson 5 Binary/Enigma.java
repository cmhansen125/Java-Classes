import java.io.*;

public class Enigma {

	public static void main(String[] args) throws IOException {
		
		String input = args[0];
		File inF = new File(input);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inF));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(inF));
		
		int r = 0;
		while ((r = bis.read()) != -1) {
			output.write((byte)r + 5);
			
		}
		
		bis.close();
		output.close();

	}

}
