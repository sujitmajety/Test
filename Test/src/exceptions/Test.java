package exceptions;

public class Test {

	public static void main(String[] args) {
		Bank b=new Bank();
		try {
			b.withdraw(45000.00);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		b.printBalance();
	}
}
