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
		System.out.println("대여 TV 채널 " + getChannel() + "번의 프로를 플레이 합니다.");
	}

	public void rent() {
		System.out.println(getModel() + "모델의 상품을 대여합니다. " + String.format("%,d", price) + "원을 지불해 주세요.");
	}

	public String toString() {
		return "대여상품정보 : 모델명(" + getModel() + "), 가격(" + String.format("%,d", price) + "원), 크기(" + getSize() + ")";
	}

}
