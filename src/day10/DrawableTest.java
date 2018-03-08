package day10;

import java.util.Random;

interface Drawable {
	public abstract void draw();
	
}

class Rect implements Drawable {
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
}

class Diamont implements Drawable {
	public void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

public class DrawableTest {

	public static void main(String[] args) {
		Random rand = new Random(); //ctrl + shift + M
		int num = rand.nextInt(3);
		Drawable d = null;
		if (num == 0)
			d = new Rect();
		else if (num == 1)
			d = new Circle();
		else if (num == 2)
			d = new Diamont();
		output(d);
	}

	public static void output(Drawable d) {
		System.out.println("���޵� ��ü�� Ŭ������: " + d.getClass().getName());
		d.draw();
	}

}
