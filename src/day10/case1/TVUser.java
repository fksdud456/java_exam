package day10.case1;
public class TVUser {
	public static void main(String[] args) {
		/*
		 * LG <=> Samsung 
		 * function 이름이 다름
		*/
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
	}
}
