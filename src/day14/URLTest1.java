package day14;

import java.net.*;
import java.io.*;

public class URLTest1 {
	public static void main(String[] args) {
		try {
			URL req = new URL("http://movie.naver.com/");
			InputStream is = req.openStream();	//InputStream : bytestream �ѱ۱���
			InputStreamReader isr = new InputStreamReader(is,"UTF-8"); //default EUC-KR 
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String data = br.readLine(); // 1byte�� �о�ͼ� �ѱ� ����
				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ���� :" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO���� :" + e.getMessage());
		}
	}
}
