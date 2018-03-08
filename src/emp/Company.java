package emp;

public class Company {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);
		printEmployee(emp, false);

		System.out.println("인센티브 100 지급");
		for (Employee data : emp) {
			if (data instanceof Bonus)
				((Bonus) data).incentive(100);
		}
		printEmployee(emp, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		System.out.print("name\t department\t salary");
		if (isTax)
			System.out.print("\t\t tax");
		System.out.println("\n---------------------------------------------");

		for (Employee data : emp) {
			System.out.print(String.format("%-9s%-16s%-10d", data.getName(), data.getDepartment(), data.getSalary()));
			if (isTax)
				System.out.print("\t" + data.tax());
			System.out.println();
		}
		System.out.println();
	}
}
