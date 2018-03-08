package day8;

public class FriendTest {

	public static void main(String[] args) {
		Friend friends[] = new Friend[5];
		friends[0] = new Friend("듀크", "123-4554-6622", "duke@gmail.com");
		friends[1] = new Friend("둘리", "010-4214-4455", "dl@gmail.com");
		friends[2] = new Friend("또치", "010-8858-8080", "ddo@gmail.com");
		friends[3] = new Friend("희동", "010-5065-4400", "hd@gmail.com");
		friends[4] = new Friend("이콜", "010-1505-4305", "ma@gmail.com");

		System.out.println("이름\t전화번호\t\t메일주소" + "\n--------------------------------------");
		for (Friend data : friends) {
			System.out.println(data.getInfo());
		}
	}

}
