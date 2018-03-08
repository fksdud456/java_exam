package test;

public class Goods {
	String prodId; // 상품 아이디
	String prodName; // 상품 이름
	int price; // 상품 가격
	char asYn; // AS 가능 여부

	public Goods(String prodId, String prodName, int price) {
		this(prodId, prodName, price, 'Y');
	}
	
	public Goods(String prodId, String prodName, int price, char asYn) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = asYn;
	}

	public String getGoodsInfo() {
		String as = asYn == 'Y' ? "가능" : "불가";
		return "상품ID : " + prodId + ", 상품명 : " + prodName 
				+ ", 가격 : " + String.format("%,d", price) + "원, AS가능여부 : " + as;
	}
}

