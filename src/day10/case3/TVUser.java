package day10.case3;

public class TVUser {
	public static void main(String[] args) {	
		TV tv = TVFactory.getTV(args[0]);
		if(tv != null) {
			tv.powerOn();
			tv.volumnUp();
			tv.volumnDown();
			tv.powerOff();
		} else {
			System.out.println("���α׷� �ƱԸ�Ʈ�� samsung �Ǵ� lg �� �Է��� �ּ���..");
		}
	}
}
