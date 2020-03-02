import java.util.ArrayList;

public class DataSetBook {
	
	private ArrayList<Book> dataSetBook = new ArrayList<Book>();

	public DataSetBook() {
		
	}
	
	public void add(Book objToAdd) {
		dataSetBook.add(objToAdd);
		
	}
	
	public int size() {
		int numOfBooks = dataSetBook.size();
		return numOfBooks;
	}
	
	public Book getMax() {
		Book maxPages = dataSetBook.get(0);
		for (int i = 0; i < dataSetBook.size(); i++) {
			if (dataSetBook.get(i).getPages() > maxPages.getPages()) {
				maxPages = dataSetBook.get(i);
			}
		}
		return maxPages;
	}
	
	public Book getMin() {
		if (dataSetBook.isEmpty()) {
			return null;
		} else {
			Book minPages = dataSetBook.get(0);
			for (int i = 0; i < dataSetBook.size(); i++) {
				if (dataSetBook.get(i).getPages() < minPages.getPages()) {
					minPages = dataSetBook.get(i);
				}
			}
			return minPages;
		}
		
	}
	
	public String toString() {
		String returnString = "";
		for (int i = 0; i < dataSetBook.size(); i++) {
			returnString += dataSetBook.get(i) + "\n";
		}
		return  returnString;
		
	}
}
