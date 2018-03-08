package test;

public class Goods {
	String prodId; // ��ǰ ���̵�
	String prodName; // ��ǰ �̸�
	int price; // ��ǰ ����
	char asYn; // AS ���� ����

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
		String as = asYn == 'Y' ? "����" : "�Ұ�";
		return "��ǰID : " + prodId + ", ��ǰ�� : " + prodName 
				+ ", ���� : " + String.format("%,d", price) + "��, AS���ɿ��� : " + as;
	}
}

