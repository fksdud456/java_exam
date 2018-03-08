package day2;
public class IfTest1 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) +1;
		/*if(num % 2 != 0)
			 System.out.println(num + " : È¦¼ö");
		else
			System.out.println(num + " : Â¦¼ö");*/
		if(num % 2 != 0)
			 System.out.println(num + " : È¦¼ö");
		if(num % 2 == 0)
			System.out.println(num + " : Â¦¼ö");
		System.out.println("¼öÇàÁ¾·á");
	}
}
