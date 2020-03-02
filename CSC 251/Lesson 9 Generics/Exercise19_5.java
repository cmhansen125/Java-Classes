
public class Exercise19_5 {

	public static void main(String[] args) {
		
		Integer[] list = {1, 2, 3, 4, 5};
		System.out.println("Maximum : " + max(list));
	}

	public static <E extends Comparable<E>> E max(E[] list) {
		
		E max = list[0];
		for (int i = 0; i < list.length; i++) {
			E element = list[i];
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
}
