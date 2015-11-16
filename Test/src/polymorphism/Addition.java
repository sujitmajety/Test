package polymorphism;

public class Addition {
	public int sum(int a, int b){
		return a+b;
	}
	public int sum(int a, int b,int c){
		return a+b+c;
	}
	public double sum(int a, double b){
		return a+b;
	}
	public double sum(double a,int b){
		return a+b;
	}
}
