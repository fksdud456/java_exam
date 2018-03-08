package day13;

import java.io.*;

public class FileWriterTest2 {
	public static void main(String[] args) {
		/*
		 * try ( -- ) 에서 fileWriter 생성하면 알아서 close함
		 * try 블럭이 끝날 때 알아서 close함
		 */		
		try (FileWriter writer = new FileWriter("c:/iotest/output2.txt")) {
			char arr[] = { '객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write('\n'); // windows는 \r\n 있어야 개행됨
			writer.write(arr);
			writer.write('\n');
			writer.write("OCJP 시험 대비");
			writer.write('\n');
			System.out.println("파일에 출력 완료!!");
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
}
