package day2;

public class TimeTest {

	public static void main(String[] args) {
		
		int time = 32150;//초
		int hour = time / 3600;
		int minute = (time%3600)/60;
		int second = (time%3600)%60;
			
	/*	int sec = time % 60;
		int min = (time / 60) % 60;
		int hor = time / 3600;*/
		
		/*int a=time/3600;
		int b=time/60-a*60;
		int c=time-3600*a-60*b;*/
		
		System.out.println(hour+"시간"+minute+"분"+second+"초");		
	}

}
