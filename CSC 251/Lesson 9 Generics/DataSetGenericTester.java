
public class DataSetGenericTester {

	public static void main(String[] args) {
		
		DataSetGeneric<Measurable> one = new DataSetGeneric<Measurable>();
		
		Measurable first = new Book(null, null, 0);
		one.add(first);
		Measurable second = new Book(null, null, 0);
		one.add(second);
		
		System.out.println(one);

	}

}
