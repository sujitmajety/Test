package abstraction;

public abstract class Honda extends Yokohama implements CarDesigner {
	@Override
	public void buildCarParts() {
		// TODO Auto-generated method stub
		System.out.println("Car Parts Built Successfully");
	}
	@Override
	public void deployEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Deployed Successfully");
	}
}
