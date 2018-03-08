package work;

public class TVTest {

	public static void main(String[] args) {
		TV saleTV = new SaleTV(300000, "SALETV-1", 40, 1);
		TV rentalTV = new RentalTV(100000, "RENTALTV-10", 42, 1);

		for (int i = 0; i < 2; i++)
			saleTV.channelUp();
		for (int i = 0; i < 3; i++)
			rentalTV.channelDown();

		TVTest.printAllTV(saleTV);
		TVTest.printAllTV(rentalTV);
		if (rentalTV instanceof RentalTV)
			TVTest.printRentalTV((RentalTV) rentalTV);
	}

	static void printAllTV(TV tv) {
		System.out.println(tv.toString());

		if (tv instanceof SaleTV)
			((SaleTV) tv).play();
		else if (tv instanceof RentalTV)
			((RentalTV) tv).play();

		if (tv instanceof SaleTV)
			((SaleTV) tv).sale();
	}

	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}