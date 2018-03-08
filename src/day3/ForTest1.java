package day3;

public class ForTest1 {

	public static void main(String[] args) {

		for(int su = 1; su <=10; su++) { 
			System.out.println(su);
		}
		
		System.out.println("-------");
		for(int su = 1; su <=10; su+=2) {
			System.out.println(su);
		}

		System.out.println("-------");
		for(int su = 10; su >=1; su--) {	// 초기식이 제일먼저 수행, 한번만 -> (실행 -> 증감식 -> 조건식) 반복 
			System.out.println(su);
		}
	}
}
