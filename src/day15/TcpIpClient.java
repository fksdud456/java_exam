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
			System.out.println("������ �������Դϴ�.����IP: " + serverIp);

			// ������ �����Ͽ� ������ ��û�Ѵ�.
			// Ŭ���̾�Ʈ�� �����û�ϸ� ���������� ���� �ڵ������� ?????
			// c������ bind �Լ� ����ؾ��ϴµ� java�� �����ڿ� ��Ʈ��ȣ �ָ�, bind ��.
			// port��ȣ�� ���������� ���� ����

			Socket socket = new Socket(serverIp, 7777);

			// socket�� �Է½�Ʈ���� ��´�.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			// ���
			System.out.println("�����κ��� ���� �޼���" + dis.readUTF());
			System.out.println("������ �����մϴ�");

			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");

		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
