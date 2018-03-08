package day7;

import java.io.File;

/* File객체는 꼭 체크하고자 하는 파일 경로를 전달해야 한다. 
 * 매개변수 없이 객체 생성할 수 있는 생성자가 없음
 */

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:/yum/workspace/JavaExam/src/day7/StudentTest.java");
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length() + "바이트의 파일입니다.");
			}			
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

}
