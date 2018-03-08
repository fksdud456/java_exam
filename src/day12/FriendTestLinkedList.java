package day12;

import java.util.Iterator;
import java.util.LinkedList;
import day8.Friend;

public class FriendTestLinkedList {
	public static void main(String[] args) {
		LinkedList<Friend> friends = new LinkedList<>();
		friends.add(new Friend("듀크", "123-4554-6622", "duke@gmail.com"));
		friends.add(new Friend("둘리", "010-4214-4455", "dl@gmail.com"));
		friends.add(new Friend("또치", "010-8858-8080", "ddo@gmail.com"));
		friends.add(new Friend("희동", "010-5065-4400", "hd@gmail.com"));
		friends.add(new Friend("이콜", "010-1505-4305", "ma@gmail.com"));

		System.out.println("이름\t전화번호\t\t메일주소" + "\n--------------------------------------");
		
		for (Friend data : friends) {
			System.out.println(data.getInfo());
		}
		
		Iterator<Friend> it = friends.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getInfo());
		}
		

		Iterator iter = friends.iterator();
		while(iter.hasNext()){
			System.out.println(((Friend)iter.next()).getInfo());
		}
	}

}
