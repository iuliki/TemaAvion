
public class TomCat extends AvionLupta {

	public TomCat(String planeID, int totalEnginePowe) {
		super(planeID, totalEnginePowe);

	}

	public void refuel() {
		System.out.println("PlaneID Value" + planeID + "  Initiating refueling procedure "
				+ "Locating refueller - Catching up -\r\n " + "Refueling - Refueling complete");
	}
}
