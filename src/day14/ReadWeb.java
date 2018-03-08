package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadWeb {
	public static void main(String[] args) {
		String path = "C:/iotest/output/";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}

		System.out.println("경로를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		sc.close();
		
		String[] fileInfo = url.split("/");
		String fileName = fileInfo[fileInfo.length - 1];
		String[] format = fileName.split("[.]");
		
		try {
			URL req = new URL(url);
			InputStream is = req.openStream();	//byte단위로 읽어오기
			System.out.println(format[format.length - 1]);
			System.out.println(format[format.length - 1].equals("html"));
			if (format[format.length - 1].equals("html")) {
				/* byte에서 stream으로 읽어오도록 Reader사용 */
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				//BufferedWriter 써도돼
				PrintWriter writer = new PrintWriter(path + fileName);
				while (true) {
					String data = br.readLine();
					if (data == null)
						break;
					writer.write(data+"\r\n");
					System.out.println(data+"\n");
				}
				writer.close();
			} else {
				FileOutputStream fos = new FileOutputStream(path + fileName);
				int input = 0;
				while (true) {
					input = is.read();
					if (input == -1)
						break;
					fos.write(input);
				}
				fos.close();
			}
		} catch (MalformedURLException e) {
			System.out.println("URL 오류 :" + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O 오류 :" + e.getMessage());
		}
	
	
	}
	
	
}
