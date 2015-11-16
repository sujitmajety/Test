package polymorphism;

public class Y extends X {
	@Override
	public void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping in Y");
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
	public void display(){
		System.out.println("display");
	}
}
