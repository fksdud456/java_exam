package day8;

public class FriendTest {

	public static void main(String[] args) {
		Friend friends[] = new Friend[5];
		friends[0] = new Friend("��ũ", "123-4554-6622", "duke@gmail.com");
		friends[1] = new Friend("�Ѹ�", "010-4214-4455", "dl@gmail.com");
		friends[2] = new Friend("��ġ", "010-8858-8080", "ddo@gmail.com");
		friends[3] = new Friend("��", "010-5065-4400", "hd@gmail.com");
		friends[4] = new Friend("����", "010-1505-4305", "ma@gmail.com");

		System.out.println("�̸�\t��ȭ��ȣ\t\t�����ּ�" + "\n--------------------------------------");
		for (Friend data : friends) {
			System.out.println(data.getInfo());
		}
	}

}
