import java.util.ArrayList;


public class DataSetGeneric<E> implements Measurable {
	
	ArrayList<E> data = new ArrayList<>();
	
	public DataSetGeneric() {
		
	}
	public void add(E objToAdd) {
		data.add(objToAdd);
	}
	

	public int size() {
		return data.size();
	}
	
	
	public E getMin() {
		if (data.isEmpty()) {
			return null;
		}
		E mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (((Measurable) mEle).getMeasure() > (((Measurable) data.get(i)).getMeasure())) {
				mEle = data.get(i);
			}
		}
		return mEle;
	}

	
	public E getMax() {
		if (data.isEmpty()) {
			return null;
		}
		E mEle = data.get(0);
		
		for (int i = 1; i < data.size(); i++) {
			if (((Measurable) mEle).getMeasure() < ((Measurable) data.get(i)).getMeasure()) {
				mEle = data.get(i);
				
			}
		}
		return mEle;
	}

	
	@Override
	public String toString() {
		return "Library [\n size: " + size() + "\n getMin: " + getMin() + " getMax: " + getMax()
				+ " Collection:\n" + data.toString() + "]";
	}
	@Override
	public int getMeasure() {
		return data.size();
	}
}
