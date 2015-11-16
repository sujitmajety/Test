package basic;

public class Student {
	private int rollNumber;
	private String name;
	private String email;
	private long phoneNumber;
	private String address;
	private static String school;
	static{
		school="Delhi Public School";
	}
	public Student() {
		rollNumber = 0;
		name = null;
		email = null;
		phoneNumber = 0;
		address = null;
		school = null;
	}

	public Student(int rollNumber, String name, String email, long phoneNumber, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		String data = "Roll Number : " + rollNumber;
		data = data + "\nName : " + name;
		data = data + "\nPhone Number : " + phoneNumber;
		data = data + "\nEmail : " + email;
		data = data + "\nAddress : " + address;
		data = data + "\nSchool : " + school;
		return data;
	}
}
