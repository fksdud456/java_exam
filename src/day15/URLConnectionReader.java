package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");
			URLConnection uc = u.openConnection();
  
			// 내용추출 body
			InputStream is = (InputStream) uc.getContent();	
			BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);

			// 응답헤더에 있는 정보
			System.out.println("Content-type:" + uc.getContentType());	 
			System.out.println("Date: " + new java.util.Date(uc.getDate()));
			System.out.println("Content-length :" + uc.getContentLength());
		} catch (MalformedURLException e) {
			System.err.println("URL is not a URL I understand");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
