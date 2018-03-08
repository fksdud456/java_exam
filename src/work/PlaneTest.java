package work;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane�� Cargoplane ��ü ����
		Plane airplane = new Airplane("L747", 1000);
		Plane cargoplane = new Cargoplane("C40", 1000);
		// ������ ��ü�� ���� ���
		printTitle();
		printInfo(airplane);
		printInfo(cargoplane);

		// Airplane�� Cargoplane ��ü�� 100�� ���� �� ��ü ���� ���
		System.out.println("\n[100����]");
		airplane.flight(100);
		cargoplane.flight(100);
		printTitle();
		printInfo(airplane);
		printInfo(cargoplane);

		// Airplane�� Cargoplane ��ü�� 200 ���� �� ��ü ���� ���
		System.out.println("\n[200����]");
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
