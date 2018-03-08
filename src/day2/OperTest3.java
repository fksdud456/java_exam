package day2;
public class OperTest3 {
	public static void main(String[] args) {
		double r_value;
		for(int i=1; i <= 10; i++) {
			r_value = Math.random(); // 0.0 <= n < 1.0
			System.out.println(r_value +"\t\t"+r_value * 6 + "\t\t"+
			                                    (int)((r_value * 6)+1));			
		}
	}
}



