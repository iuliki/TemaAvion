
public class Main {

	public static void main(String[] args) {

		Avion normalAvion = new Avion("765ds", 1000);
		System.out.println(normalAvion.getPlaneID());
		Concorde concord = new Concorde("fsd54", 30000, 20);

		AvionCalatori calatori = new AvionCalatori("45gf", 5000, 200);
		System.out.println(calatori.getMaxNumberOfPassangers());

		Boeing bo = new Boeing("df5", 400, 3);

		AvionLupta lupta = new AvionLupta("345sdf", 7000);
		lupta.launchMissile();

		Mig lupta2 = new Mig("375f", 800);
		lupta2.highSpeedGeometry();
		lupta2.normalGeometry();

		TomCat cat = new TomCat("65", 890);
		cat.refuel();

	}

}
