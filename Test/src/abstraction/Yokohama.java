package abstraction;

public abstract class Yokohama implements CarDesigner{
	@Override
	public void buildEngine() {
		System.out.println("Engine Built Successfully");
	}
}
