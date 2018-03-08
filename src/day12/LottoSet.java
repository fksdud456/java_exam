package day12;

import java.util.HashSet;
import java.util.Iterator;

public class LottoSet {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		while (lotto.size() < 10) {
			lotto.add((int) (Math.random() * (20 + 1)) + 10);
		}

		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> it = lotto.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext())
				System.out.print(", ");
		}
	}
}
