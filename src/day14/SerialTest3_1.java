package day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import day8.Friend;

public class SerialTest3_1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/iotest/Person1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new day8.Friend("a","b","3"));
		oos.writeObject(new Date());
		oos.close();
		fos.close();
		System.out.println("직렬화 출력 완료");
		
		FileInputStream fis = new FileInputStream("c:/iotest/Person1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println((Friend)ois.readObject());
		fis.close();
		ois.close();
		
	}
}
