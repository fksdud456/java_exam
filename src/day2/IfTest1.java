package day2;
public class IfTest1 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) +1;
		/*if(num % 2 != 0)
			 System.out.println(num + " : �汝�");
		else
			System.out.println(num + " : 礎熱");*/
		if(num % 2 != 0)
			 System.out.println(num + " : �汝�");
		if(num % 2 == 0)
			System.out.println(num + " : 礎熱");
		System.out.println("熱ч謙猿");
	}
}
