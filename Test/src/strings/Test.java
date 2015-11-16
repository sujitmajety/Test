package strings;

public class Test {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = new String("Hello");
		String s2="Hello";
		System.out.println(s==s2);
		
		s=s.concat(" World");
		System.out.println(s);
		System.out.println(s+"World");
	}

}
