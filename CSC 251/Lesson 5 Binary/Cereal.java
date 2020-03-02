import java.io.*;
import java.util.Random;

public class Cereal {
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		if (args.length > 0) {
			try {
				int firstArg = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.print("Must be an integer");
				System.exit(1);
			}
		}
		
		int firstArg = Integer.parseInt(args[0]);
		String secondArg = args[1];
		
		File outF = new File(secondArg);
		FileOutputStream fos = new FileOutputStream(outF);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
				
		DataSetBook one = new DataSetBook();
		Random r = new Random();
		
		for (int i = 0; i < firstArg; i++) {
			String book_num = Integer.toString(i);
			Book book = new Book("book" + book_num, "author" + book_num, 
					r.nextInt(101)+100);
			one.add(book);
			
			
		}
		System.out.println(one);
		oos.writeObject(one);
		System.out.println(oos);
		oos.close();
		
		FileInputStream fis = new FileInputStream(outF);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois);
        
        DataSetBook oneNew = (DataSetBook) ois.readObject();
        ois.close();

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
