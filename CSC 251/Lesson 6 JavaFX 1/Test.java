import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		B b = new B();
	}
}
class A {
	private int i = 1;
	protected int j = 2;
}

class B extends A {
	private int k = 3;
	protected int m = 4;
	public B () {
		System.out.println(i + j + k + m);
	}
	
}