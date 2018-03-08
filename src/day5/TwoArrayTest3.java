package day5;

public class TwoArrayTest3 {

	public static void main(String[] args) {

		boolean two[][] = new boolean[4][];
		two[0] = new boolean[5];
		two[1] = new boolean[8];
		two[2] = new boolean[3];
		two[3] = new boolean[10];
		
		System.out.println(two.length);
		System.out.println(two[0].length);
		System.out.println(two[1].length);
		System.out.println(two[2].length);
		System.out.println(two[3].length);
		
		/*for(int i = 0 ; i < two.length ; i++) {
			for(int j =0; j<two[i].length; j++) {
				
				System.out.print(two[i][j]+"\t");	
			}
			System.out.println();
		}*/
		
		for(boolean tmp[] : two) {
			for(boolean i : tmp) {
				System.out.print(i + "\t");
			}
			System.out.println("\n-----------------------"
					+ "----------------------------------"
					+ "----------------------");
		}
	}

}