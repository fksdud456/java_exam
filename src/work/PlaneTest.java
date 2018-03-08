package work;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체 생성
		Plane airplane = new Airplane("L747", 1000);
		Plane cargoplane = new Cargoplane("C40", 1000);
		// 생성된 객체의 정보 출력
		printTitle();
		printInfo(airplane);
		printInfo(cargoplane);

		// Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력
		System.out.println("\n[100운힝]");
		airplane.flight(100);
		cargoplane.flight(100);
		printTitle();
		printInfo(airplane);
		printInfo(cargoplane);

		// Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
		System.out.println("\n[200주유]");
		airplane.refuel(200);
		cargoplane.refuel(200);
		printTitle();
		printInfo(airplane);
		printInfo(cargoplane);
	}

	public static void printInfo(Plane list) {
		System.out.println(list.getPlaneName() + "\t\t" + list.getFuelSize());
	}

	public static void printTitle() {
		System.out.println("Plane\t\t" + "fuelSize\n" + "--------------------------------");
	}

}
