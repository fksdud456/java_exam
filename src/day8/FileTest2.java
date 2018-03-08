package day8;
import java.io.File;
public class FileTest2 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("점검하려는 파일명을 프로그램 아규먼트로 전달하세요.");
			return;		
		}
			
		File f = new File(args[0]);
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println(args[0] + " 디렉토리입니다.");
			} else {
				System.out.println(args[0] + " : " + f.length()+" 바이트의 파일입니다.");
			}
		} else {
			System.out.println(args[0] + "존재하지 않습니다.");
		}
	}
}
