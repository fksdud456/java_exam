package day2;
public class IfTest2 {
	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) +1;
		/*
		 *  month ���� 12,1,2 �̸� "x���� �ܿ�"
		 *  month ���� 3,4,5 �̸� "x���� ��"
		 *  month ���� 6,7,8 �̸� "x���� ����"
		 *  month ���� 9,10,11 �̸� "x���� ����"
		 */
		if(month ==12||month == 1 || month ==2)
			System.out.println(month+"���� �ܿ�");
		else if(month==3||month==4||month==5)
			System.out.println(month+"���� ��");
		else if(month==6||month==7||month==8)
			System.out.println(month+"���� ����");
		else
			System.out.println(month+"���� ����");
		
		System.out.println("��������");
	}
}
