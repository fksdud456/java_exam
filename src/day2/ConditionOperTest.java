package day2;

public class ConditionOperTest {

	public static void main(String[] args) {
		int grade = (int) (Math.random() * 5) + 1;
		int result;
		if (grade == 1)
			result = 300 + 50;
		else if (grade == 2)
			result = 300 - 50;
		else if (grade == 3)
			result = 300 * 50;
		else if (grade == 4)
			result = 300 / 50;
		else 
			result = 300 % 50;
		
		System.out.println("°á°ú°ª : " + result);
	}

}
