import java.util.ArrayList;

public class DataSetLibrary {
	
	private ArrayList<Book> dataSetBook = new ArrayList<Book>();
	private ArrayList<Video> dataSetVideo = new ArrayList<Video>();

	public DataSetLibrary() {
		
	}
	
	public void add(Book objToAdd) {
		dataSetBook.add(objToAdd);
		
	}
	public void add(Video objToAdd) {
		dataSetVideo.add(objToAdd);
		
	}
	
	public int sizeBook() {
		int numOfBooks = dataSetBook.size();
		return numOfBooks;
	}
	
	public int sizeVideo() {
		int numOfVideos= dataSetVideo.size();
		return numOfVideos;
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
	
	public Video getMaxMins() {
		Video maxMins= dataSetVideo.get(0);
		for (int i = 0; i < dataSetVideo.size(); i++) {
			if (dataSetVideo.get(i).getMinutes() > maxMins.getMinutes()) {
				maxMins= dataSetVideo.get(i);
			}
		}
		return maxMins;
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
	
	public Video getMinMins() {
		if (dataSetVideo.isEmpty()) {
			return null;
		} else {
			Video minMins= dataSetVideo.get(0);
			for (int i = 0; i < dataSetVideo.size(); i++) {
				if (dataSetVideo.get(i).getMinutes() < minMins.getMinutes()) {
					minMins= dataSetVideo.get(i);
				}
			}
			return minMins;
		}
		
	}
	
	public String toString() {
		String returnString = "This Library has these books:\n";
		if (dataSetBook.isEmpty()) {
			returnString += "There are no books currently!";
		}
		else { 
			for (int i = 0; i < dataSetBook.size(); i++) {
				returnString += dataSetBook.get(i) + "\n";
			}
		}
		returnString += "\nThis Library has these Videos: \n";
		if (dataSetVideo.isEmpty()) {
			returnString += "There are no videos currently!";
		} else {
			for (int i = 0; i < dataSetVideo.size(); i++) {
				returnString += dataSetVideo.get(i) + "\n";
			}
		}
		return  returnString;
		
	}
}
