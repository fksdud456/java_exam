package test;

public class GoodsTest {
	public static void main(String[] args) {
		Goods prod1 = new Goods("PRD-0001", "듀크컴퓨터", 10000, 'N'); 
		System.out.println(prod1.getGoodsInfo()); 
		Goods prod2 = new Goods("PRD-0002", "턱시컴퓨터", 20000); 
		System.out.println(prod2.getGoodsInfo());
	}
}
