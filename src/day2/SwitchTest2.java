package day2;
public class SwitchTest2 {
	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) +1;
		/*
		 *  month ���� 12,1,2 �̸� "x���� �ܿ�"
		 *  month ���� 3,4,5 �̸� "x���� ��"
		 *  month ���� 6,7,8 �̸� "x���� ����"
		 *  month ���� 9,10,11 �̸� "x���� ����"
		 *  if ������ �����ߴ� ���� switch ������ ��ȯ
		 */
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���� �ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���� ��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "���� ����");
			break;
		default:
			System.out.println(month + "���� ����");
		}
		
		System.out.println("��������");
	}
}
