package work;

public class SaleTV extends TV {
	private int price;

	public SaleTV() { }

	public SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.println("�Ǹ� TV ä�� " + getChannel() + "���� ���θ� �÷��� �մϴ�.");
	}

	public void sale() {
		System.out.println(String.format(getModel() + "���� ��ǰ�� �Ǹ��մϴ�. %,d���� ������ �ּ���.", price));
	}

	public String toString() {
		return String.format("�ǸŻ�ǰ���� : �𵨸�(" + getModel() + "), ����(%,d��), ũ��(" + getSize() + ")", price);
	}
}
