import java.util.HashSet;


public class HashPlay {

	public static void main(String[] args) {
		Book b1 = new Book("C. S. Lewis", "Out of the Silent Planet", "1234");
		Book b2 = new Book("CS Lewis", "Out Of The Silent Planet", "1234");
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		HashSet<Book> hm = new HashSet<>();
		
		hm.add(b1);
		System.out.println("removal of book: " + hm.remove(b2));
		
		System.out.println(hm);

	}

}
