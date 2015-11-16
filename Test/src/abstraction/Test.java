package abstraction;

public class Test {
	public static void main(String[] args) {
		Driver d=new Driver();
		d.buildEngine();
		d.buildCarParts();
		d.deployEngine();
		d.driveCar();
	}
}
