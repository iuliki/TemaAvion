
public class Avion {
	protected String planeID;
	// protected ii permite accesul doar claselor mostenitoare

	protected int totalEnginePowe;

	public Avion(String planeID, int totalEnginePowe) {
		super();
		this.planeID = planeID;
		this.totalEnginePowe = totalEnginePowe;
	}

	public String getPlaneID() {
		return planeID;
	}

	public int getTotalEnginePowe() {
		return totalEnginePowe;
	}

	public String takeOff() {
		return "PlaneID" + planeID + " "
				+ "Initiating takeoprocedure - Starting engines - Accelerating down\r\n the runway - Taking  - Retracting gear - Takeo↵ complete";
	}

	public String fly() {
		return "plaane Id + " + planeID + "flying";

	}

	public String land() {
		return "plane id " + planeID + "Initiating landing procedure - Enabling airbrakes -\r\n"
				+ "Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing\r\n" + "complete”.";

	}

}
