package day15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {

	public static void main(String[] args) {
		try {
			String serverIp = "70.12.114.116";
			System.out.println("서버에 연결중입니다.서버IP: " + serverIp);

			// 소켓을 생성하여 연결을 요청한다.
			// 클라이언트가 연결요청하면 서버에서는 소켓 자동생성됨 ?????
			// c에서는 bind 함수 사용해야하는데 java는 생성자에 포트번호 주면, bind 됨.
			// port번호와 서버소켓을 묶는 개념

			Socket socket = new Socket(serverIp, 7777);

			// socket의 입력스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			// 출력
			System.out.println("서버로부터 받은 메세지" + dis.readUTF());
			System.out.println("연결을 종료합니다");

			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");

		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
