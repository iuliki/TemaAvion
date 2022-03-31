
public class AvionLupta extends Avion {

	public AvionLupta(String planeID, int totalEnginePowe) {
		super(planeID, totalEnginePowe);

	}

	public void launchMissile() {
		System.out.println("PlaneID Value" + this.planeID
				+ " Initiating missile launch procedure Acquiring target - Launching missile - Break-ing away - Missile launch complete");
	}

}
