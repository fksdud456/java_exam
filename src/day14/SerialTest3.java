package day14;

/*
 * day6.Student 객체 직렬화 테스트
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import day6.Student;

public class SerialTest3 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/iotest/test2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student st = new Student("duke", 23, "java프로그래밍");
		oos.writeObject(st);
		oos.writeObject(new Date());
		Thread.sleep(3000);
		oos.writeObject(new Date());
		oos.close();
		fos.close();
		System.out.println("직렬화 출력 완료");
	}
}
