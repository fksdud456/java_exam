package day3;
public class MonitorSelection {
	public static void main(String[] args) {
		String students[ ] = {
				"������", "����ȣ","�̼���", "������", "������", 
				"���Լ�", "�����", "�赿��", "�ռ���", "������",
				"ȫ����", "������", "������", "������", "������",
				"������", "���¿�", "������", "������", "�վָ�",
				"����"
		};
		int index = (int)(Math.random()*21);
		System.out.println("�����մϴ�...!! �츮���� ������ "+
							students[index] +"�Դϴ�...!!! ������");
	}
}



