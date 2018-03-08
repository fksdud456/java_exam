package day3;
public class MonitorSelection {
	public static void main(String[] args) {
		String students[ ] = {
				"한현우", "윤종호","이선빈", "정선우", "박준하", 
				"조규석", "조용원", "김동건", "손성은", "유영무",
				"홍현택", "정다혜", "조상혁", "이종훈", "장태익",
				"박현경", "이태우", "곽지훈", "안유정", "손애리",
				"김경민"
		};
		int index = (int)(Math.random()*21);
		System.out.println("축하합니다...!! 우리반의 반장은 "+
							students[index] +"입니다...!!! ㅎㅎㅎ");
	}
}



