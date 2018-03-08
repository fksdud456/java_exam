package day15;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) throws Exception{
		InetAddress me = InetAddress.getLocalHost();
		System.out.println(me.getHostAddress());
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
	}
}