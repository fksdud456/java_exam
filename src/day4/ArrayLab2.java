package day4;

public class ArrayLab2 {

	public static void main(String[] args) {
		char str[] = { 'J', 'a', 'v', 'a', 'D', 'u', 'K', 'e' };
		
		char A = 'A';
		char Z = 'Z';
		System.out.println((int)A+", "+(int)Z);
		// 'a', 0x61, 97
		for (int i = 0; i < str.length; i++) {
			if (str[i] < 'a') //�� ���� Ÿ���� �ٸ��� ����ȯ ������ �ʾƵ� �˾Ƽ� ����ȯ
				str[i] = (char) (str[i] + 32);
			else
				str[i] = (char) (str[i] - 32);
		}

		System.out.print("��ȯ�� �迭 : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i == str.length - 1)
				System.out.println();
			else
				System.out.print(", ");
		}
		
		System.out.print(str);
	}

}
