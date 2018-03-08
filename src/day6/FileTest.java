package day6;
import java.io.File;
public class FileTest {
	public static void main(String[] args) {
		File f = new File("C:/yum/workspace/javaexam/src");
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("디렉토리입니다.");
			} else {
				System.out.println(f.length()+" 바이트의 파일입니다.");
			}
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
}

