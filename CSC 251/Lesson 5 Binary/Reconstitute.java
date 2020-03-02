import java.io.*;

public class Reconstitute {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String fileName = args[0];
		
		File input = new File(fileName);
		FileInputStream fis = new FileInputStream(input);
		ObjectInputStream ois = new ObjectInputStream(fis);
		DataSetBook newOne = (DataSetBook) (ois.readObject());
		System.out.println(newOne);
		ois.close();
		
		

	}

}
