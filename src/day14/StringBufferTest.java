package day14;
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		String str = "�ڹ����α׷���";
		buffer.append(str);
		System.out.printf("%s\n", buffer);
		System.out.printf("%s\n", buffer.reverse());
		System.out.printf("���� : %d\n", buffer.reverse().length());
		System.out.printf("%c\n", buffer.reverse().charAt(0));
		System.out.printf("%s\n", buffer.reverse());
	}
}
