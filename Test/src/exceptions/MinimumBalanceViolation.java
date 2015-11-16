package exceptions;

public class MinimumBalanceViolation extends Exception{
	public static String message;
	public MinimumBalanceViolation() {
		super(message);
	}
	public MinimumBalanceViolation(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return message;
	}
}
