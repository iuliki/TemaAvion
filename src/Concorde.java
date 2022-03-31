
public class Concorde extends AvionCalatori {

	public Concorde(String planeID, int totalEnginePowe, int maxNumberOfPassangers) {
		super(planeID, totalEnginePowe, maxNumberOfPassangers);

	}

	public void goSuperSonic() {
		System.out.println("planeId " + this.planeID + "-Supersonic mode activated");

	}

	public void goSubSonic() {
		System.out.println("planeId " + this.planeID + "-Subsonic mode deactivated");

	}

}
