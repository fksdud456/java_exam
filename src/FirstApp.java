public class FirstApp {	
	public static void main(String[] args) {		
		System.out.println("�ȳ��ϼ���?");
		try {
			System.out.println(10/0);  // �� : /, ������ : %
		}catch(ArithmeticException e) { 
			System.out.println("���ܹ߻����� ó���Ұ�!"); 
		}
		System.out.println(100+200);
		System.out.println(100>200);
	}
}
