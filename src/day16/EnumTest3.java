package day16;

enum Season2 {
	��,����, ����, �ܿ�
}
public class EnumTest3 {

	public static void main(String[] args) {
		System.out.println(Season2.��);
		System.out.println(Season2.����);
		System.out.println(Season2.����);
		System.out.println(Season2.�ܿ�);
		Season2 data = Season2.����;
		
		if(data == Season2.����) {
			System.out.println("����� �����ϴ� ������ ����!!!");
		}
	}

}
