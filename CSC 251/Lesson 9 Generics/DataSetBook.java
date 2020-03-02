

import java.util.ArrayList;


public class DataSetBook {
	
	private ArrayList<Book> data;

	
	public DataSetBook() {
		data = new ArrayList<>();
	}
	
	public void add(Book objToAdd) {
		data.add(objToAdd);
	}
	

	public int size() {
		return data.size();
	}
	
	
	public Book getMin() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() > (data.get(i).getPages())) {
				mEle = data.get(i);
			}
		}
		return mEle;
	}

	
	public Book getMax() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() < (data.get(i).getPages())) {
				mEle = data.get(i);
			}
		}
		return mEle;
	}

	
	@Override
	public String toString() {
		return "DataSetBook [\n size()=" + size() + "\n getMin()=" + getMin() + " getMax()=" + getMax()
				+ " Books=\n" + data.toString() + "]";
	}



	

}
