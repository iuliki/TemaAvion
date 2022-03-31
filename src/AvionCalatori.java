
public class AvionCalatori extends Avion {

	protected int maxNumberOfPassangers;

	public AvionCalatori(String planeID, int totalEnginePowe, int maxNumberOfPassangers) {
		super(planeID, totalEnginePowe);
		this.maxNumberOfPassangers = maxNumberOfPassangers;

	}

	public int getMaxNumberOfPassangers() {
		return maxNumberOfPassangers;
	}

}
