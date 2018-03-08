package day7;
import java.io.File;
import java.util.Scanner;
public class FileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		sc.close();
		File f = new File(fileName);
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
