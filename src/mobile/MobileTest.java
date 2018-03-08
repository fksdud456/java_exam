package mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobileArr = new Mobile[2];
		mobileArr[0] = new Ltab("Ltab", 500, "ABC-01");
		mobileArr[1] = new Otab("Otab", 1000, "XYZ-20");

		printTitle();
		printMobile(mobileArr);

		for (Mobile m : mobileArr)
			m.charge(10);

		System.out.println("\n[ 10분 충전 ]");
		printTitle();
		printMobile(mobileArr);

		for (Mobile m : mobileArr)
			m.operate(5);

		System.out.println("\n[ 5분 통화 ]");
		printTitle();
		printMobile(mobileArr);

	}

	public static void printMobile(Mobile[] mobile) {
		for (Mobile m : mobile) {
			System.out.println(m.getMobileName() + "\t\t" + m.getBatterySize() + "\t\t" + m.getOsType());
		}
	}

	public static void printTitle() {
		System.out.println(
				"Mobile\t\t" + "Battery\t\t" + "OS\n"
						+ "--------------------------------------------------------");
	}
}
