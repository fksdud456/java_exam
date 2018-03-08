package work;

interface Rentable {
	void rent();
}

public class RentalTV extends TV implements Rentable {
	private int price;

	public RentalTV() { }

	public RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("�뿩 TV ä�� " + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}

	public void rent() {
		System.out.println(getModel() + "���� ��ǰ�� �뿩�մϴ�. " + String.format("%,d", price) + "���� ������ �ּ���.");
	}

	public String toString() {
		return "�뿩��ǰ���� : �𵨸�(" + getModel() + "), ����(" + String.format("%,d", price) + "��), ũ��(" + getSize() + ")";
	}

}
