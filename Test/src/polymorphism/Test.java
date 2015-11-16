package polymorphism;

public class Test {
	public static void main(String[] args) {
		X x=new Y();
		int a=30,b=40;
		System.out.println("Before Swapping in Test");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		x.swap(a, b);
	}
}
