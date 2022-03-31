
public class Mig extends AvionLupta {

	public Mig(String planeID, int totalEnginePowe) {
		super(planeID, totalEnginePowe);
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID Value" + planeID + " High speed ge-\r\n ometry selected");
	}

	public void normalGeometry() {
		System.out.println("PlaneID Value" + planeID + " Normal geometry selected");
	}
}
