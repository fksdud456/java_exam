package day3;
public class WhileTest2 {
	public static void main(String[] args) {		
		System.out.println("수행시작");		
		int num=0;		
		/*boolean flag = true;
		while(flag) {
			num = (int)(Math.random()*6)+1;
			if(num == 3) {
				System.out.println("축하합니다. 당첨되었어요..." + num);
				flag = false;
			} else {
				System.out.println("안타깝네요... : "+num);
			}
		}*/
		while(true) {
			num = (int)(Math.random()*6)+1;
			if(num == 3) {
				System.out.println("축하합니다. 당첨되었어요..." + num);
				break;
			} else {
				System.out.println("안타깝네요... : "+num);
			}
		}
		System.out.println("수행종료");
	}
}










