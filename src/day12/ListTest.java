package day12;

public class ListTest {

	public static void main(String[] args) {
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};

		for(int temp : ConvertList.convertList(array)) {
			System.out.println(temp);
		}
	}

}
