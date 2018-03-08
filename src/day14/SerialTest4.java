package day14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

import day6.Student;

public class SerialTest4 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("c:/iotest/test2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st = (Student)ois.readObject();
		st.studentInfo();
		/*System.out.println((Student)ois.readObject()); */
		// readObject 객체 생성 후 값 셋팅 해주는 역할
		System.out.println((Date)ois.readObject());
		System.out.println((Date)ois.readObject());
		ois.readObject();
		fis.close();
		ois.close();
	}
}
