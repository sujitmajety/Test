package polymorphism;

public class X {
	public void swap(int a, int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping in X");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}
